package no.uit.syntHIR.dataWrangling.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class DataWranglingUtil {

	/***
	 * Read CSV and convert it onto list of beans
	 * 
	 * @param <T>
	 * @param csvFileLocation
	 * @param className
	 * @param list
	 * @return List of objects of type 'T' (Generic)
	 */
	public static <T> List<T> readCsvToBeanList(String csvFileLocation, Class<T> className, List<T> list) {

		HeaderColumnNameMappingStrategy<T> ms = new HeaderColumnNameMappingStrategy<T>();
		ms.setType(className);

		try {
			CsvToBean<T> cb = new CsvToBeanBuilder<T>(new FileReader(csvFileLocation))
					.withType(className)
					.withMappingStrategy(ms)
					.build();

			list = cb.parse();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	/***
	 * Read CSV and convert it onto list of beans
	 * 
	 * @param <T>
	 * @param fileBufferedReader
	 * @param className
	 * @param list
	 * @return List of objects of type 'T' (Generic)
	 */
	public static <T> List<T> readCsvToBeanList(BufferedReader fileBufferedReader, Class<T> className, List<T> list) {

		HeaderColumnNameMappingStrategy<T> ms = new HeaderColumnNameMappingStrategy<T>();
		ms.setType(className);

		CsvToBean<T> cb = new CsvToBeanBuilder<T>(fileBufferedReader)
				.withType(className)
				.withMappingStrategy(ms)
				.build();

		list = cb.parse();

		return list;
	}

	/***
	 * Convert list of String[] to an
	 * object of CSV data
	 * 
	 * @param List<String[]>
	 * @return BufferedReader
	 */
	public static BufferedReader writeListOfStringArrayToCSV(List<String[]> data) {

		File file = new File("temp.csv");
		BufferedReader bufferedReader = null;
		FileWriter outputfile;
		try {
			outputfile = new FileWriter(file);

			CSVWriter writer = new CSVWriter(outputfile);
			writer.writeAll(data);
			writer.close();
			bufferedReader = new BufferedReader(new FileReader(file));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return bufferedReader;

	}

	/***
	 * Compare the key names of the mapping file
	 * with the header names of the input CSV
	 * and return list of new header names
	 * 
	 * 
	 * @param mappingFileInputStream
	 * @param headerList
	 * @return List<String>
	 */
	public static List<String> compareWithMappingFileAndReturnNewHeaderList(InputStream mappingFileInputStream,
			List<String> headerList) {

		List<String> updatedHeaderList = new ArrayList<String>();

		Yaml mappingFile = new Yaml();
		Map<String, Object> mappingFileData = mappingFile.load(mappingFileInputStream);

		@SuppressWarnings("unchecked")
		Map<String, String> dataMappingMap = (Map<String, String>) mappingFileData.get("dataMapping");

		for (String headerName : headerList) {

			String newHeader = dataMappingMap.get(headerName.trim());
			updatedHeaderList.add(newHeader);

		}
		return updatedHeaderList;
	}

	/***
	 * Convert list of java bean
	 * object to a CSV file
	 * 
	 * @param <T>
	 * @param csvFileLocation
	 * @param className
	 * @param list
	 * @return <T> File
	 */
	public static <T> File readBeanToCSV(String csvFileLocation, Class<T> className, List<T> list) {

		HeaderColumnNameMappingStrategy<T> mappingStrategy = new HeaderColumnNameMappingStrategy<T>();
		mappingStrategy.setType(className);

		try {
			Writer fileWriter = Files.newBufferedWriter(Paths.get(csvFileLocation));

			StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(fileWriter)
					.withMappingStrategy(mappingStrategy)
					// .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();

			beanToCsv.write(list);
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvDataTypeMismatchException e) {
			e.printStackTrace();
		} catch (CsvRequiredFieldEmptyException e) {
			e.printStackTrace();
		}

		return new File(csvFileLocation);
	}

	/***
	 * Convert list of java bean
	 * object to a CSV file
	 * 
	 * @param <T>
	 * @param csvFile
	 * @param className
	 * @param list
	 * @return <T> File
	 */
	public static <T> File readBeanToCSV(File csvFile, Class<T> className, List<T> list) {

		HeaderColumnNameMappingStrategy<T> mappingStrategy = new HeaderColumnNameMappingStrategy<T>();
		mappingStrategy.setType(className);

		try {
			FileWriter fileWriter = new FileWriter(csvFile);

			StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(fileWriter)
					.withMappingStrategy(mappingStrategy)
					// .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();

			beanToCsv.write(list);
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvDataTypeMismatchException e) {
			e.printStackTrace();
		} catch (CsvRequiredFieldEmptyException e) {
			e.printStackTrace();
		}

		return csvFile;
	}

	/**
	 * Takes input as 1 or 2 which is the encoded value of gender
	 * in the dataset. Convert gender encoding to male or female.
	 * gender encoding for FHIR format : male or female
	 * 
	 * @param genderEncodingStr
	 * @return String
	 */
	public static String convertGenderEncoding(String genderEncodingStr) {
		String genderFHIR = "";
		if (!(BasicUtil.isStringNull(genderEncodingStr) || BasicUtil.isStringBlank(genderEncodingStr)
				|| BasicUtil.isStringEmpty(genderEncodingStr))) {
			genderEncodingStr = String.format("%.0f", Double.parseDouble(genderEncodingStr));
			int practitionerGenderInt = Integer.parseInt(genderEncodingStr);
			genderFHIR = practitionerGenderInt == 1 ? "male" : "female";
		}
		return genderFHIR;
	}

}
