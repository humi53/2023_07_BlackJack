package com.ny.aenean.cardconfig;

public enum TestCard {
	MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2);
	
	private final String stringValue;
	private final int intValue;
	
	private TestCard(String strValue, int intValue) {
		this.stringValue = strValue;
		this.intValue = intValue;
	}
	
	public String getStrValue() {
		return stringValue;
	}
	
	public int getIntValue() {
		return intValue;
	}
    
}
