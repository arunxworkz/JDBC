package com.xworkz.jpanamedquery.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "itemsdetails")
@NamedQuery(name = "findAll", query = "select it from ItemsDTO it")
@NamedQuery(name = "findById", query = "select it.name from ItemsDTO it where it.id = 29")
@NamedQuery(name = "findByIdByName", query = "select it.price from ItemsDTO it where it.id = :id and it.name = :name")
@NamedQuery(name = "findByIdByNameHardcoded", query = "select it.price from ItemsDTO it where it.id=31 and it.name = 'Fridge'")
@NamedQuery(name = "getData", query = "select it.name from ItemsDTO it where it.id = :id")
public class ItemsDTO {

	
	public ItemsDTO(  String name, double price) {
	
		this.name = name;
		this.price = price;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "price")
	double price;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemsDTO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
