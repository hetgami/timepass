package com.personal.society.management.app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ResidentType {
	@JsonProperty("owner")
	OWNER, 
	
	@JsonProperty("tenant")
	TENANT;
}
