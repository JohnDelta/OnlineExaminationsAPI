package com.junior_workers.bodies;

import java.util.List;

import com.junior_workers.models.*;

public class UpdateCandidateRequest {
	
	private String jwt;
	private User user;
	private List<Skill> skills;
	private List<Language> languages;
	private List<Education> allEducation;
	private List<Experience> experiences;
	
	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	public User getUser() {
		return user;
	}
	
	public List<Skill> getSkills() {
		return skills;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<Education> getAllEducation() {
		return allEducation;
	}

	public void setAllEducation(List<Education> allEducation) {
		this.allEducation = allEducation;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}
	
}