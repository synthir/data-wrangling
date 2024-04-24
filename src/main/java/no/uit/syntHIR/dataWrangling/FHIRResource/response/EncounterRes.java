package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EncounterRes {

	private String resourceType;
	private ArrayList<IdentifierRes> identifier;
	private String status;
	@JsonProperty("class")
	private CodingRes myclass;
	private ArrayList<TypeRes> type;
	private ReferenceRes subject;
	private ArrayList<EncounterLocationRes> location;
	private EncounterHospitalizationRes hospitalization;
	private PeriodRes period;
	private ArrayList<EncounterDiagnosisRes> diagnosis;
	private ArrayList<EncounterParticipantRes> participant;

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public ArrayList<IdentifierRes> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(ArrayList<IdentifierRes> identifier) {
		this.identifier = identifier;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CodingRes getMyclass() {
		return this.myclass;
	}

	public void setMyclass(CodingRes myclass) {
		this.myclass = myclass;
	}

	public ArrayList<TypeRes> getType() {
		return this.type;
	}

	public void setType(ArrayList<TypeRes> type) {
		this.type = type;
	}

	public ReferenceRes getSubject() {
		return this.subject;
	}

	public void setSubject(ReferenceRes subject) {
		this.subject = subject;
	}

	public ArrayList<EncounterLocationRes> getLocation() {
		return this.location;
	}

	public void setLocation(ArrayList<EncounterLocationRes> location) {
		this.location = location;
	}

	public EncounterHospitalizationRes getHospitalization() {
		return this.hospitalization;
	}

	public void setHospitalization(EncounterHospitalizationRes hospitalization) {
		this.hospitalization = hospitalization;
	}

	public PeriodRes getPeriod() {
		return this.period;
	}

	public void setPeriod(PeriodRes period) {
		this.period = period;
	}

	public ArrayList<EncounterDiagnosisRes> getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(ArrayList<EncounterDiagnosisRes> diagnosis) {
		this.diagnosis = diagnosis;
	}

	public ArrayList<EncounterParticipantRes> getParticipant() {
		return this.participant;
	}

	public void setParticipant(ArrayList<EncounterParticipantRes> participant) {
		this.participant = participant;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", status='" + getStatus() + "'" +
				", myclass='" + getMyclass() + "'" +
				", type='" + getType() + "'" +
				", subject='" + getSubject() + "'" +
				", location='" + getLocation() + "'" +
				", hospitalization='" + getHospitalization() + "'" +
				", period='" + getPeriod() + "'" +
				", diagnosis='" + getDiagnosis() + "'" +
				", participant='" + getParticipant() + "'" +
				"}";
	}

}
