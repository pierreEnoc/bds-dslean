package com.devsuperior.dslearnbds.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fildMessage;
	private String message;
	
	public FieldMessage() {
		
	}

	public FieldMessage(String fildMessage, String message) {
		super();
		this.fildMessage = fildMessage;
		this.message = message;
	}

	public String getFildMessage() {
		return fildMessage;
	}

	public void setFildMessage(String fildMessage) {
		this.fildMessage = fildMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
