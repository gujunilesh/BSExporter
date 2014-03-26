package com.bhajansangrah.model;

public interface BhajanIfc {

	int songNumber = -1;
	String language = "";
	
	public String getNativeText();
	public String getPhoneticText();
	public String getTranslatedText();
	
}
