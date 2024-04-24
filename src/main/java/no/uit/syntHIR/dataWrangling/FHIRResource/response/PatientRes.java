package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientRes {

	private String resourceType;
	private ArrayList<IdentifierRes> identifier;
	private ArrayList<NameRes> name;
	private String gender;
	private String birthDate;
	private boolean deceasedBoolean;
	private String deceasedDateTime;
	private ArrayList<AddressRes> address;
	private ArrayList<ExtensionPatientRes> extension;

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

	public ArrayList<NameRes> getName() {
		return this.name;
	}

	public void setName(ArrayList<NameRes> name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isDeceasedBoolean() {
		return this.deceasedBoolean;
	}

	public boolean getDeceasedBoolean() {
		return this.deceasedBoolean;
	}

	public void setDeceasedBoolean(boolean deceasedBoolean) {
		this.deceasedBoolean = deceasedBoolean;
	}

	public String getDeceasedDateTime() {
		return this.deceasedDateTime;
	}

	public void setDeceasedDateTime(String deceasedDateTime) {
		this.deceasedDateTime = deceasedDateTime;
	}

	public ArrayList<AddressRes> getAddress() {
		return this.address;
	}

	public void setAddress(ArrayList<AddressRes> address) {
		this.address = address;
	}

	public ArrayList<ExtensionPatientRes> getExtension() {
		return this.extension;
	}

	public void setExtension(ArrayList<ExtensionPatientRes> extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", name='" + getName() + "'" +
				", gender='" + getGender() + "'" +
				", birthDate='" + getBirthDate() + "'" +
				", deceasedBoolean='" + isDeceasedBoolean() + "'" +
				", deceasedDateTime='" + getDeceasedDateTime() + "'" +
				", address='" + getAddress() + "'" +
				", extension='" + getExtension() + "'" +
				"}";
	}

}
