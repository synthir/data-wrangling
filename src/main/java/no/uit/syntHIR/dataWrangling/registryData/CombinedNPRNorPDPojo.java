package no.uit.syntHIR.dataWrangling.registryData;

import com.opencsv.bean.CsvBindByName;

public class CombinedNPRNorPDPojo {

	@CsvBindByName(column = "hospitalizationUrgency")
	private String hospitalizationUrgency;
	
	@CsvBindByName(column = "patientAgeGroup")
	private String patientAgeGroup;
	
	@CsvBindByName(column = "hospitalizationDiagnosis")
	private String hospitalizationMainDiagnosis;
	
	@CsvBindByName(column = "hospitalizationDischargeLocation")
	private String hospitalizationPatientDischargeLocation;
	
	@CsvBindByName(column = "hospitalizationLevelOfCare")
	private String hospitalizationLevelOfCare;
	
	@CsvBindByName(column = "patiendId")
	private String patiendId;
	
	@CsvBindByName(column = "patientIdType")
	private String patientIdType;
	
	@CsvBindByName(column = "hospitalizationPatientVisitStart")
	private String hospitalizationPatientVisitStart;
	
	@CsvBindByName(column = "hospitalizationPatientVisitEnd")
	private String hospitalizationPatientVisitEnd;
	
	@CsvBindByName(column = "patientDOB")
	private String patientDateOfBirth;
	
	@CsvBindByName(column = "patientGender")
	private String patientGender;
	
	@CsvBindByName(column = "patientDeathYear")
	private String patientDeathYear;
	
	@CsvBindByName(column = "patientDeathMonth")
	private String patientDeathMonth;
	
	@CsvBindByName(column = "patientCountyNumber")
	private String patientCountyNumber;
	
	@CsvBindByName(column = "patientCountyName")
	private String patientCountyName;
	
	@CsvBindByName(column = "practitionerId")
	private String practitionerId;
	
	@CsvBindByName(column = "practitionerIdType")
	private String practitionerIdType;
	
	@CsvBindByName(column = "practitionerDOB")
	private String practitionerDateOfBirth;
	
	@CsvBindByName(column = "practitionerGender")
	private String practitionerGender;
	
	@CsvBindByName(column = "prescriptionLegalCategory")
	private String prescriptionLegalCategory;
	
	@CsvBindByName(column = "prescriptionLegalCategoryCode")
	private String prescriptionLegalCategoryCode;
	
	@CsvBindByName(column = "prescriptionLegalCategoryCode")
	private String reimbursementLegalCategory;
	
	@CsvBindByName(column = "reimbursementLegalCategoryCode")
	private String reimbursementLegalCategoryCode;
	
	@CsvBindByName(column = "reimbursementICDCode")
	private String reimbursementICDCode;
	
	@CsvBindByName(column = "reimbursementICPCCode")
	private String reimbursementICPCCode;	
	
	@CsvBindByName(column = "prescribedDrugNumber")
	private String prescribedDrugNumber;
	
	@CsvBindByName(column = "prescribedDrugName")
	private String prescribedDrugName;
	
	@CsvBindByName(column = "prescribedDrugATCCode")
	private String prescribedDrugATCCode;
	
	@CsvBindByName(column = "prescribedDrugATCCodeDDD")
	private String prescribedDrugATCCodeDDD;
	
	@CsvBindByName(column = "prescribedDrugATCCodeDDDDose")
	private String prescribedDrugATCCodeDDDDose;
	
	@CsvBindByName(column = "prescriptionNumber")
	private String prescriptionNumber;
	
	@CsvBindByName(column = "instituteName")
	private String instituteName;
	
	@CsvBindByName(column = "prescribedDrugDeliveryDate")
	private String prescribedDrugDeliveryDate;
	
	@CsvBindByName(column = "numberOfPackagesDispensedForDrug")
	private String numberOfPackagesDispensedForDrug;
	
	@CsvBindByName(column = "numberOfPackagesDispensedForDrugDDD")
	private String numberOfPackagesDispensedForDrugDDD;

	public String getHospitalizationUrgency() {
		return hospitalizationUrgency;
	}

	public void setHospitalizationUrgency(String hospitalizationUrgency) {
		this.hospitalizationUrgency = hospitalizationUrgency;
	}

	

	public String getPatientAgeGroup() {
		return patientAgeGroup;
	}

	public void setPatientAgeGroup(String patientAgeGroup) {
		this.patientAgeGroup = patientAgeGroup;
	}

	public String getHospitalizationMainDiagnosis() {
		return hospitalizationMainDiagnosis;
	}

	public void setHospitalizationMainDiagnosis(String hospitalizationMainDiagnosis) {
		this.hospitalizationMainDiagnosis = hospitalizationMainDiagnosis;
	}

	public String getHospitalizationPatientDischargeLocation() {
		return hospitalizationPatientDischargeLocation;
	}

	public void setHospitalizationPatientDischargeLocation(String hospitalizationPatientDischargeLocation) {
		this.hospitalizationPatientDischargeLocation = hospitalizationPatientDischargeLocation;
	}

	public String getHospitalizationLevelOfCare() {
		return hospitalizationLevelOfCare;
	}

	public void setHospitalizationLevelOfCare(String hospitalizationLevelOfCare) {
		this.hospitalizationLevelOfCare = hospitalizationLevelOfCare;
	}

	public String getPatiendId() {
		return patiendId;
	}

	public void setPatiendId(String patiendId) {
		this.patiendId = patiendId;
	}

	public String getPatientIdType() {
		return patientIdType;
	}

	public void setPatientIdType(String patientIdType) {
		this.patientIdType = patientIdType;
	}

	public String getHospitalizationPatientVisitStart() {
		return hospitalizationPatientVisitStart;
	}

	public void setHospitalizationPatientVisitStart(String hospitalizationPatientVisitStart) {
		this.hospitalizationPatientVisitStart = hospitalizationPatientVisitStart;
	}

	public String getHospitalizationPatientVisitEnd() {
		return hospitalizationPatientVisitEnd;
	}

	public void setHospitalizationPatientVisitEnd(String hospitalizationPatientVisitEnd) {
		this.hospitalizationPatientVisitEnd = hospitalizationPatientVisitEnd;
	}

	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientDeathYear() {
		return patientDeathYear;
	}

	public void setPatientDeathYear(String patientDeathYear) {
		this.patientDeathYear = patientDeathYear;
	}

	public String getPatientDeathMonth() {
		return patientDeathMonth;
	}

	public void setPatientDeathMonth(String patientDeathMonth) {
		this.patientDeathMonth = patientDeathMonth;
	}

	public String getPatientCountyNumber() {
		return patientCountyNumber;
	}

	public void setPatientCountyNumber(String patientCountyNumber) {
		this.patientCountyNumber = patientCountyNumber;
	}

	public String getPatientCountyName() {
		return patientCountyName;
	}

	public void setPatientCountyName(String patientCountyName) {
		this.patientCountyName = patientCountyName;
	}

	public String getPractitionerId() {
		return practitionerId;
	}

	public void setPractitionerId(String practitionerId) {
		this.practitionerId = practitionerId;
	}

	public String getPractitionerIdType() {
		return practitionerIdType;
	}

	public void setPractitionerIdType(String practitionerIdType) {
		this.practitionerIdType = practitionerIdType;
	}

	public String getPractitionerDateOfBirth() {
		return practitionerDateOfBirth;
	}

	public void setPractitionerDateOfBirth(String practitionerDateOfBirth) {
		this.practitionerDateOfBirth = practitionerDateOfBirth;
	}

	public String getPractitionerGender() {
		return practitionerGender;
	}

	public void setPractitionerGender(String practitionerGender) {
		this.practitionerGender = practitionerGender;
	}

	public String getPrescriptionLegalCategory() {
		return prescriptionLegalCategory;
	}

	public void setPrescriptionLegalCategory(String prescriptionLegalCategory) {
		this.prescriptionLegalCategory = prescriptionLegalCategory;
	}

	public String getPrescriptionLegalCategoryCode() {
		return prescriptionLegalCategoryCode;
	}

	public void setPrescriptionLegalCategoryCode(String prescriptionLegalCategoryCode) {
		this.prescriptionLegalCategoryCode = prescriptionLegalCategoryCode;
	}

	public String getReimbursementLegalCategory() {
		return reimbursementLegalCategory;
	}

	public void setReimbursementLegalCategory(String reimbursementLegalCategory) {
		this.reimbursementLegalCategory = reimbursementLegalCategory;
	}

	public String getReimbursementLegalCategoryCode() {
		return reimbursementLegalCategoryCode;
	}

	public void setReimbursementLegalCategoryCode(String reimbursementLegalCategoryCode) {
		this.reimbursementLegalCategoryCode = reimbursementLegalCategoryCode;
	}

	public String getReimbursementICDCode() {
		return reimbursementICDCode;
	}

	public void setReimbursementICDCode(String reimbursementICDCode) {
		this.reimbursementICDCode = reimbursementICDCode;
	}

	public String getReimbursementICPCCode() {
		return reimbursementICPCCode;
	}

	public void setReimbursementICPCCode(String reimbursementICPCCode) {
		this.reimbursementICPCCode = reimbursementICPCCode;
	}

	public String getPrescribedDrugNumber() {
		return prescribedDrugNumber;
	}

	public void setPrescribedDrugNumber(String prescribedDrugNumber) {
		this.prescribedDrugNumber = prescribedDrugNumber;
	}

	public String getPrescribedDrugName() {
		return prescribedDrugName;
	}

	public void setPrescribedDrugName(String prescribedDrugName) {
		this.prescribedDrugName = prescribedDrugName;
	}

	public String getPrescribedDrugATCCode() {
		return prescribedDrugATCCode;
	}

	public void setPrescribedDrugATCCode(String prescribedDrugATCCode) {
		this.prescribedDrugATCCode = prescribedDrugATCCode;
	}

	public String getPrescribedDrugATCCodeDDD() {
		return prescribedDrugATCCodeDDD;
	}

	public void setPrescribedDrugATCCodeDDD(String prescribedDrugATCCodeDDD) {
		this.prescribedDrugATCCodeDDD = prescribedDrugATCCodeDDD;
	}

	public String getPrescribedDrugATCCodeDDDDose() {
		return prescribedDrugATCCodeDDDDose;
	}

	public void setPrescribedDrugATCCodeDDDDose(String prescribedDrugATCCodeDDDDose) {
		this.prescribedDrugATCCodeDDDDose = prescribedDrugATCCodeDDDDose;
	}

	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}

	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getPrescribedDrugDeliveryDate() {
		return prescribedDrugDeliveryDate;
	}

	public void setPrescribedDrugDeliveryDate(String prescribedDrugDeliveryDate) {
		this.prescribedDrugDeliveryDate = prescribedDrugDeliveryDate;
	}

	public String getNumberOfPackagesDispensedForDrug() {
		return numberOfPackagesDispensedForDrug;
	}

	public void setNumberOfPackagesDispensedForDrug(String numberOfPackagesDispensedForDrug) {
		this.numberOfPackagesDispensedForDrug = numberOfPackagesDispensedForDrug;
	}

	public String getNumberOfPackagesDispensedForDrugDDD() {
		return numberOfPackagesDispensedForDrugDDD;
	}

	public void setNumberOfPackagesDispensedForDrugDDD(String numberOfPackagesDispensedForDrugDDD) {
		this.numberOfPackagesDispensedForDrugDDD = numberOfPackagesDispensedForDrugDDD;
	}

	@Override
	public String toString() {
		return "CombinedNPRNorPDPojo [hospitalizationUrgency=" + hospitalizationUrgency + ", patientAgeGroup="
				+ patientAgeGroup + ", hospitalizationMainDiagnosis=" + hospitalizationMainDiagnosis
				+ ", hospitalizationPatientDischargeLocation=" + hospitalizationPatientDischargeLocation
				+ ", hospitalizationLevelOfCare=" + hospitalizationLevelOfCare + ", patiendId=" + patiendId
				+ ", patientIdType=" + patientIdType + ", hospitalizationPatientVisitStart="
				+ hospitalizationPatientVisitStart + ", hospitalizationPatientVisitEnd="
				+ hospitalizationPatientVisitEnd + ", patientDateOfBirth=" + patientDateOfBirth + ", patientGender="
				+ patientGender + ", patientDeathYear=" + patientDeathYear + ", patientDeathMonth=" + patientDeathMonth
				+ ", patientCountyNumber=" + patientCountyNumber + ", patientCountyName=" + patientCountyName
				+ ", practitionerId=" + practitionerId + ", practitionerIdType=" + practitionerIdType
				+ ", practitionerDateOfBirth=" + practitionerDateOfBirth + ", practitionerGender=" + practitionerGender
				+ ", prescriptionLegalCategory=" + prescriptionLegalCategory + ", prescriptionLegalCategoryCode="
				+ prescriptionLegalCategoryCode + ", reimbursementLegalCategory=" + reimbursementLegalCategory
				+ ", reimbursementLegalCategoryCode=" + reimbursementLegalCategoryCode + ", reimbursementICDCode="
				+ reimbursementICDCode + ", reimbursementICPCCode=" + reimbursementICPCCode + ", prescribedDrugNumber="
				+ prescribedDrugNumber + ", prescribedDrugName=" + prescribedDrugName + ", prescribedDrugATCCode="
				+ prescribedDrugATCCode + ", prescribedDrugATCCodeDDD=" + prescribedDrugATCCodeDDD
				+ ", prescribedDrugATCCodeDDDDose=" + prescribedDrugATCCodeDDDDose + ", prescriptionNumber="
				+ prescriptionNumber + ", instituteName=" + instituteName + ", prescribedDrugDeliveryDate="
				+ prescribedDrugDeliveryDate + ", numberOfPackagesDispensedForDrug=" + numberOfPackagesDispensedForDrug
				+ ", numberOfPackagesDispensedForDrugDDD=" + numberOfPackagesDispensedForDrugDDD
				+ ", getHospitalizationUrgency()=" + getHospitalizationUrgency() + ", getPatientAgeGroup()="
				+ getPatientAgeGroup() + ", getHospitalizationMainDiagnosis()=" + getHospitalizationMainDiagnosis()
				+ ", getHospitalizationPatientDischargeLocation()=" + getHospitalizationPatientDischargeLocation()
				+ ", getHospitalizationLevelOfCare()=" + getHospitalizationLevelOfCare() + ", getPatiendId()="
				+ getPatiendId() + ", getPatientIdType()=" + getPatientIdType()
				+ ", getHospitalizationPatientVisitStart()=" + getHospitalizationPatientVisitStart()
				+ ", getHospitalizationPatientVisitEnd()=" + getHospitalizationPatientVisitEnd()
				+ ", getPatientDateOfBirth()=" + getPatientDateOfBirth() + ", getPatientGender()=" + getPatientGender()
				+ ", getPatientDeathYear()=" + getPatientDeathYear() + ", getPatientDeathMonth()="
				+ getPatientDeathMonth() + ", getPatientCountyNumber()=" + getPatientCountyNumber()
				+ ", getPatientCountyName()=" + getPatientCountyName() + ", getPractitionerId()=" + getPractitionerId()
				+ ", getPractitionerIdType()=" + getPractitionerIdType() + ", getPractitionerDateOfBirth()="
				+ getPractitionerDateOfBirth() + ", getPractitionerGender()=" + getPractitionerGender()
				+ ", getPrescriptionLegalCategory()=" + getPrescriptionLegalCategory()
				+ ", getPrescriptionLegalCategoryCode()=" + getPrescriptionLegalCategoryCode()
				+ ", getReimbursementLegalCategory()=" + getReimbursementLegalCategory()
				+ ", getReimbursementLegalCategoryCode()=" + getReimbursementLegalCategoryCode()
				+ ", getReimbursementICDCode()=" + getReimbursementICDCode() + ", getReimbursementICPCCode()="
				+ getReimbursementICPCCode() + ", getPrescribedDrugNumber()=" + getPrescribedDrugNumber()
				+ ", getPrescribedDrugName()=" + getPrescribedDrugName() + ", getPrescribedDrugATCCode()="
				+ getPrescribedDrugATCCode() + ", getPrescribedDrugATCCodeDDD()=" + getPrescribedDrugATCCodeDDD()
				+ ", getPrescribedDrugATCCodeDDDDose()=" + getPrescribedDrugATCCodeDDDDose()
				+ ", getPrescriptionNumber()=" + getPrescriptionNumber() + ", getInstituteName()=" + getInstituteName()
				+ ", getPrescribedDrugDeliveryDate()=" + getPrescribedDrugDeliveryDate()
				+ ", getNumberOfPackagesDispensedForDrug()=" + getNumberOfPackagesDispensedForDrug()
				+ ", getNumberOfPackagesDispensedForDrugDDD()=" + getNumberOfPackagesDispensedForDrugDDD()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
}