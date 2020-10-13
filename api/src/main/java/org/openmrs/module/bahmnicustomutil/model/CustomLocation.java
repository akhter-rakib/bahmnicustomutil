package org.openmrs.module.bahmnicustomutil.model;

public class CustomLocation {
	
	private int id;
	
	private String name;
	
	private String uuid;
	
	private String location_tag_name;
	
	public String getLocation_tag_name() {
		return location_tag_name;
	}
	
	public void setLocation_tag_name(String location_tag_name) {
		this.location_tag_name = location_tag_name;
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
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
