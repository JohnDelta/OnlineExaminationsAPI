package com.junior_workers.bodies;

import java.util.List;

import com.junior_workers.models.Language;
import com.junior_workers.models.Skill;
import com.junior_workers.models.User;

public class CandidateResponse {

	private User user;
	private List<Skill> skills;
	private List<Language> languages;
	
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
	
}
