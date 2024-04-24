package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtensionPatientRes {

	private String valueString;

	public ExtensionPatientRes() {
	}

	public ExtensionPatientRes(String valueString) {
		this.valueString = valueString;
	}

	public String getValueString() {
		return this.valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}

	public ExtensionPatientRes valueString(String valueString) {
		setValueString(valueString);
		return this;
	}

	@Override
	public String toString() {
		return "{" +
				" valueString='" + getValueString() + "'" +
				"}";
	}

}
