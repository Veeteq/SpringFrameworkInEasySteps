package com.springframework;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties languages;

	public Properties getLanguages() {
		return languages;
	}

	public void setLanguages(Properties languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Languages [languages=" + languages + "]";
	}
	
}
