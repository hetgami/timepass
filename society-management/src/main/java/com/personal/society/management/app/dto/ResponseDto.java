package com.personal.society.management.app.dto;

public class ResponseDto {
	private boolean result;

	private String message;

	public ResponseDto(boolean result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
