package no.uit.syntHIR.dataWrangling.FHIRResource.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressRes {

	public String use;
	public String city;
	public String district;
	public String state;
	public String postalCode;
	public String country;

	public AddressRes() {
	}

	public AddressRes(String use, String city, String district, String state, String postalCode, String country) {
		this.use = use;
		this.city = city;
		this.district = district;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String getUse() {
		return this.use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AddressRes use(String use) {
		setUse(use);
		return this;
	}

	public AddressRes city(String city) {
		setCity(city);
		return this;
	}

	public AddressRes district(String district) {
		setDistrict(district);
		return this;
	}

	public AddressRes state(String state) {
		setState(state);
		return this;
	}

	public AddressRes postalCode(String postalCode) {
		setPostalCode(postalCode);
		return this;
	}

	public AddressRes country(String country) {
		setCountry(country);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof AddressRes)) {
			return false;
		}
		AddressRes addressRes = (AddressRes) o;
		return Objects.equals(use, addressRes.use) && Objects.equals(city, addressRes.city)
				&& Objects.equals(district, addressRes.district) && Objects.equals(state, addressRes.state)
				&& Objects.equals(postalCode, addressRes.postalCode) && Objects.equals(country, addressRes.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(use, city, district, state, postalCode, country);
	}

	@Override
	public String toString() {
		return "{" +
				" use='" + getUse() + "'" +
				", city='" + getCity() + "'" +
				", district='" + getDistrict() + "'" +
				", state='" + getState() + "'" +
				", postalCode='" + getPostalCode() + "'" +
				", country='" + getCountry() + "'" +
				"}";
	}

}
