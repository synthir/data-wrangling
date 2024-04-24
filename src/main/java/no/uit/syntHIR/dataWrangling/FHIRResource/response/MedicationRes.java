package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MedicationRes {

	private String resourceType;
	private ArrayList<IdentifierRes> identifier;
	private CodeRes code;

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

	public CodeRes getCode() {
		return this.code;
	}

	public void setCode(CodeRes code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", code='" + getCode() + "'" +
				"}";
	}

}
