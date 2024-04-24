package no.uit.syntHIR.dataWrangling.engine;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;

import no.uit.syntHIR.dataWrangling.FHIRResource.response.ResourceResList;

public interface DataWranglingEngine {

	public List<ResourceResList> convertCSVToFHIRResourcesJson(BufferedReader csvFileBufferedReader);

	public InputStream convertFHIRResourcesJsonToCSV(List<List<String>> fhirResourceRecords);

	public InputStream convertFHIRResourcesJsonObjToCSV(List<ResourceResList> resourceResponseList);
}
