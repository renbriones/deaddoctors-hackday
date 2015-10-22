package com.deaddoctors.elasticsearch;


//@Document(indexName = "obituaries")
public class DeadDoctor {

	//@Id
	private String id;
	private String elocation;
	private String name;
	private String contribSurname;
	private String contribGivenName;
	private String deathInfo;
	private String collectionPublicationYear;
	private String message;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getElocation() {
		return elocation;
	}
	public void setElocation(String elocation) {
		this.elocation = elocation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContribSurname() {
		return contribSurname;
	}
	public void setContribSurname(String contribSurname) {
		this.contribSurname = contribSurname;
	}
	public String getContribGivenName() {
		return contribGivenName;
	}
	public void setContribGivenName(String contribGivenName) {
		this.contribGivenName = contribGivenName;
	}
	public String getDeathInfo() {
		return deathInfo;
	}
	public void setDeathInfo(String deathInfo) {
		this.deathInfo = deathInfo;
	}
	public String getCollectionPublicationYear() {
		return collectionPublicationYear;
	}
	public void setCollectionPublicationYear(String collectionPublicationYear) {
		this.collectionPublicationYear = collectionPublicationYear;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
