package com.zensar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ApiResponse {
	
	@Getter
	@Setter
	
	private String message;
	private boolean success;
	public ApiResponse() {
		super();
	}
	public ApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", success=" + success + "]";
	}
	
	

}
