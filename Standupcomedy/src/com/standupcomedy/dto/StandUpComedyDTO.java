package com.standupcomedy.dto;

public class StandUpComedyDTO {

	private int registration_id;
	private String owner_name;
	private String vehicle_make;
	private String vehicle_model;
	private int year;
	private String registrationdate;
	private String expiry_date;
	private String registartion_fee;
	private String transmissions;
	
	public StandUpComedyDTO(int registration_id, String owner_name, String vehicle_make, String vehicle_model, int year,
			String registrationdate, String expiry_date, String registartion_fee, String transmissions) {
		super();
		this.registration_id = registration_id;
		this.owner_name = owner_name;
		this.vehicle_make = vehicle_make;
		this.vehicle_model = vehicle_model;
		this.year = year;
		this.registrationdate = registrationdate;
		this.expiry_date = expiry_date;
		this.registartion_fee = registartion_fee;
		this.transmissions = transmissions;
	}

	public int getRegistration_id() {
		return registration_id;
	}

	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getVehicle_make() {
		return vehicle_make;
	}

	public void setVehicle_make(String vehicle_make) {
		this.vehicle_make = vehicle_make;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getRegistartion_fee() {
		return registartion_fee;
	}

	public void setRegistartion_fee(String registartion_fee) {
		this.registartion_fee = registartion_fee;
	}

	public String getTransmissions() {
		return transmissions;
	}

	public void setTransmissions(String transmissions) {
		this.transmissions = transmissions;
	}
	
	
}
