package com.personal.society.management.app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
	@JsonProperty("male")
	MALE, 
	
	@JsonProperty("female")
	FEMALE;
}
