package com.deaddoctors.elasticsearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "obituaries1")
public class DeadDoctor {

	@Id
	private String id;
	private String file;
	private String volume;
	private String elocation;
	private String doi;
	private String pubyear;
	private String notes;
	private String deadName;
	private String age;
	private String role;
	private String birthYear;
	private String qualifiedLabel;
	private String qualifiedPlace;
	private String qualifiedYear;
	private String qualifications;
	private String causeOfDeath;
	private String yearofDeath;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getElocation() {
		return elocation;
	}
	public void setElocation(String elocation) {
		this.elocation = elocation;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getPubyear() {
		return pubyear;
	}
	public void setPubyear(String pubyear) {
		this.pubyear = pubyear;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDeadName() {
		return deadName;
	}
	public void setDeadName(String deadName) {
		this.deadName = deadName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getQualifiedLabel() {
		return qualifiedLabel;
	}
	public void setQualifiedLabel(String qualifiedLabel) {
		this.qualifiedLabel = qualifiedLabel;
	}
	public String getQualifiedPlace() {
		return qualifiedPlace;
	}
	public void setQualifiedPlace(String qualifiedPlace) {
		this.qualifiedPlace = qualifiedPlace;
	}
	public String getQualifiedYear() {
		return qualifiedYear;
	}
	public void setQualifiedYear(String qualifiedYear) {
		this.qualifiedYear = qualifiedYear;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public String getCauseOfDeath() {
		return causeOfDeath;
	}
	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}
	public String getYearofDeath() {
		return yearofDeath;
	}
	public void setYearofDeath(String yearofDeath) {
		this.yearofDeath = yearofDeath;
	}
	
	
	
}
