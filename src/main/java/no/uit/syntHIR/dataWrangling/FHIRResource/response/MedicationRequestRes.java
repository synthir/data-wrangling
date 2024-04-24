package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MedicationRequestRes {

	private String resourceType;
	private ArrayList<IdentifierRes> identifier;
	private String status;
	private String intent;
	private ArrayList<CodeRes> category;
	private ReferenceRes medicationReference;
	private ReferenceRes subject;
	private ReferenceRes encounter;
	private ReferenceRes recorder;
	private ArrayList<AnnotationRes> note;
	private ArrayList<DosageRes> dosageInstruction;

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

	public String getIntent() {
		return this.intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public ArrayList<CodeRes> getCategory() {
		return this.category;
	}

	public void setCategory(ArrayList<CodeRes> category) {
		this.category = category;
	}

	public ReferenceRes getMedicationReference() {
		return this.medicationReference;
	}

	public void setMedicationReference(ReferenceRes medicationReference) {
		this.medicationReference = medicationReference;
	}

	public ReferenceRes getSubject() {
		return this.subject;
	}

	public void setSubject(ReferenceRes subject) {
		this.subject = subject;
	}

	public ReferenceRes getEncounter() {
		return this.encounter;
	}

	public void setEncounter(ReferenceRes encounter) {
		this.encounter = encounter;
	}

	public ReferenceRes getRecorder() {
		return this.recorder;
	}

	public void setRecorder(ReferenceRes recorder) {
		this.recorder = recorder;
	}

	public ArrayList<AnnotationRes> getNote() {
		return this.note;
	}

	public void setNote(ArrayList<AnnotationRes> note) {
		this.note = note;
	}

	public ArrayList<DosageRes> getDosageInstruction() {
		return this.dosageInstruction;
	}

	public void setDosageInstruction(ArrayList<DosageRes> dosageInstruction) {
		this.dosageInstruction = dosageInstruction;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", status='" + getStatus() + "'" +
				", intent='" + getIntent() + "'" +
				", category='" + getCategory() + "'" +
				", medicationReference='" + getMedicationReference() + "'" +
				", subject='" + getSubject() + "'" +
				", encounter='" + getEncounter() + "'" +
				", recorder='" + getRecorder() + "'" +
				", note='" + getNote() + "'" +
				", dosageInstruction='" + getDosageInstruction() + "'" +
				"}";
	}

}
