package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MedicationDispenseRes {

	private String resourceType;
	private String status;
	private ReferenceRes medicationReference;
	private ReferenceRes subject;
	private ArrayList<ReferenceRes> authorizingPrescription;
	private QuantityRes quantity;
	private QuantityRes daysSupply;
	private String whenHandedOver;

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public ArrayList<ReferenceRes> getAuthorizingPrescription() {
		return this.authorizingPrescription;
	}

	public void setAuthorizingPrescription(ArrayList<ReferenceRes> authorizingPrescription) {
		this.authorizingPrescription = authorizingPrescription;
	}

	public QuantityRes getQuantity() {
		return this.quantity;
	}

	public void setQuantity(QuantityRes quantity) {
		this.quantity = quantity;
	}

	public QuantityRes getDaysSupply() {
		return this.daysSupply;
	}

	public void setDaysSupply(QuantityRes daysSupply) {
		this.daysSupply = daysSupply;
	}

	public String getWhenHandedOver() {
		return this.whenHandedOver;
	}

	public void setWhenHandedOver(String whenHandedOver) {
		this.whenHandedOver = whenHandedOver;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", status='" + getStatus() + "'" +
				", medicationReference='" + getMedicationReference() + "'" +
				", subject='" + getSubject() + "'" +
				", authorizingPrescription='" + getAuthorizingPrescription() + "'" +
				", quantity='" + getQuantity() + "'" +
				", daysSupply='" + getDaysSupply() + "'" +
				", whenHandedOver='" + getWhenHandedOver() + "'" +
				"}";
	}

}
