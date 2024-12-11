package com.xworkz.task1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "details")
@NoArgsConstructor

@NamedQuery(name = "getById", query = "select pd from PersonDetailsEntity pd where pd.id> :id")

@NamedQuery(name = "getNameandEmail", query = "select pd.name, pd.email from PersonDetailsEntity pd where pd.phNo= :phNo")

public class PersonDetailsEntity {
	
	@Id
	int id;
	
	String name;
	int age;
	long phNo;
	double weight;
	float height;
	String email;
	@Column(name = "description")
	String descritpion;
	
	public PersonDetailsEntity(int id, String name, int age, long phNo, double weight, float height, String email, String descritpion) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.weight = weight;
		this.height = height;
		this.email = email;
		this.descritpion = descritpion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "PersonDetailsEntity [id=" + id + ", name=" + name + ", age=" + age + ", phNo=" + phNo + ", weight="
				+ weight + ", height=" + height + "]";
	}
	
	
	
}
