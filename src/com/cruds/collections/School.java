package com.cruds.collections;
//when school is accessible by third party then comparable is used.
public class School implements Comparable<School>{

	private int id;
	private String name;
	public School(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(School o) {
		return this.getName().compareTo(o.getName());
		
	}
	
	
	
}
