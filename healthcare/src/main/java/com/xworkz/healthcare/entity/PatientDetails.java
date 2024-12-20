package com.xworkz.healthcare.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "patientdetails")
@NoArgsConstructor

@NamedQuery(name = "getAll", query = "select hc from PatientDetails hc")

@NamedQuery(name = "getById", query = "select hc.patientname, hc.email from PatientDetails hc where hc.id= :id")

@NamedQuery(name = "getCountByAge", query = "select count(hc) from PatientDetails hc where hc.age> :age")

@NamedQuery(name = "getSingleAll", query = "select hc from PatientDetails hc where hc.id= :id")

@NamedQuery(name = "getAllbyName&Email", query = "select hc from PatientDetails hc where hc.patientname= :name and hc.email= :email")

@NamedQuery(name = "deleteByByName&Age", query = "delete from PatientDetails hc where hc.patientname= :name and hc.age= :age")

@NamedQuery(name = "update", query = "update PatientDetails hc set hc.is_smoker = :is_smoker where hc.email= :email and hc.phno= :phno")

@NamedQuery(name= "updateByName&Email", query = "update PatientDetails hc set hc.weight= :weight where hc.patientname= :name and hc.phno= :phno")

@NamedQuery(name = "getNameById", query = "select pd.patientname from PatientDetails pd where pd.id= : id")

@NamedQuery(name = "getIdByName", query = "select pd.id from PatientDetails pd where pd.patientname= :patientname")

@NamedQuery(name = "getBloodPressure", query = "select pd.blood_pressure from PatientDetails pd where pd.weight= :weight")

@NamedQuery(name = "getWeight", query = "select pd.weight from PatientDetails pd where pd.age= :age")

@NamedQuery(name = "getPhnonumberById", query = "select pd.phno from PatientDetails pd where pd.id= :id")

@NamedQuery(name = "getSmokerByHeartRate", query = "select pd.is_smoker from PatientDetails pd where pd.heart_rate= :heart_rate")

@NamedQuery(name = "getDateTimeByphno", query = "select pd.date_time from PatientDetails pd where pd.phno = :phno")

@NamedQuery(name = "getGenderById&Name", query = "select pd.gender from PatientDetails pd where pd.id= :id and pd.patientname= :patientname")

@NamedQuery(name = "getLocalDateByPhno", query = "select pd.date_time from PatientDetails pd where pd.phno= :phno")

@NamedQuery(name = "getGender&NameById", query = "select pd.gender, pd.patientname from PatientDetails pd where pd.id= :id")


public class PatientDetails {




	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String patientname;
	String email;
	int heart_rate;
	double blood_pressure;
	float weight;
	LocalDateTime date_time;
	int age;
	long phno;
	boolean is_smoker;
	Character gender;
	
	
	public PatientDetails(String patientname, String email, int heart_rate, double blood_pressure, float weight,
			LocalDateTime date_time, int age, long phno, boolean is_smoker) {
		super();
		this.patientname = patientname;
		this.email = email;
		this.heart_rate = heart_rate;
		this.blood_pressure = blood_pressure;
		this.weight = weight;
		this.date_time = date_time;
		this.age = age;
		this.phno = phno;
		this.is_smoker = is_smoker;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}
	public double getBlood_pressure() {
		return blood_pressure;
	}
	public void setBlood_pressure(double blood_pressure) {
		this.blood_pressure = blood_pressure;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public LocalDateTime getDate_time() {
		return date_time;
	}
	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSteps_walked() {
		return phno;
	}
	public void setSteps_walked(long phno) {
		this.phno = phno;
	}
	public boolean isIs_smoker() {
		return is_smoker;
	}
	public void setIs_smoker(boolean is_smoker) {
		this.is_smoker = is_smoker;
	}
	

	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", patientname=" + patientname + ", email=" + email + ", heart_rate="
				+ heart_rate + ", blood_pressure=" + blood_pressure + ", weight=" + weight + ", date_time=" + date_time
				+ ", age=" + age + ", phno=" + phno + ", is_smoker=" + is_smoker + ", gender=" + gender + "]";
	}
	
}
