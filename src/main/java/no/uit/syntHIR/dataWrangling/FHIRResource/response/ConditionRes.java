package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionRes {

	private String resourceType;
	private ArrayList<IdentifierRes> identifier;
	private CodeRes code;
	private ReferenceRes subject;
	private ReferenceRes encounter;

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

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", code='" + getCode() + "'" +
				", subject='" + getSubject() + "'" +
				", encounter='" + getEncounter() + "'" +
				"}";
	}

}
