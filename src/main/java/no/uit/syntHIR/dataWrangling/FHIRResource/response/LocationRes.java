package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationRes {

	public String resourceType;
	public ArrayList<IdentifierRes> identifier;
	public String name;
	public String mode;
	public AddressRes address;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public AddressRes getAddress() {
		return this.address;
	}

	public void setAddress(AddressRes address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "{" +
				" resourceType='" + getResourceType() + "'" +
				", identifier='" + getIdentifier() + "'" +
				", name='" + getName() + "'" +
				", mode='" + getMode() + "'" +
				", address='" + getAddress() + "'" +
				"}";
	}

}
