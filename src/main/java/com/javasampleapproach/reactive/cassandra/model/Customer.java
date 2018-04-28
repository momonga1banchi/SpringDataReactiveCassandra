package com.javasampleapproach.reactive.cassandra.model;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Customer {
 
	@PrimaryKey
	private String id;
 
	private String name;
	private int age;
	private boolean active;
 
	public Customer() {
	}
 
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
 
	public String getId() {
		return id;
	}
 
	public void setId(String id) {
		this.id = id;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String getName() {
		return this.name;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public int getAge() {
		return this.age;
	}
 
	public boolean isActive() {
		return active;
	}
 
	public void setActive(boolean active) {
		this.active = active;
	}
 
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + "]";
	}
}
