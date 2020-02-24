package com.pluralsight.model;

public class Speacker {

	private String speackerName;
	private String subject;

	public Speacker() {
	}

	public Speacker(String speackerName, String subject) {
		this.speackerName = speackerName;
		this.subject = subject;
	}

	public String getSpeackerName() {
		return speackerName;
	}

	public void setSpeackerName(String speackerName) {
		this.speackerName = speackerName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
