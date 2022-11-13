package com.InfastrcureJdbc.InfastrcureJdbc;

public class Bridge {
	private String bridgeCity;
	private int bridgeNumber;
	private String bridgeLength;
	private String bridgeWidth;

	public Bridge(String bridgeCity, int bridgeNumber, String bridgeLength, String bridgeWidth) {
		super();
		this.bridgeCity = bridgeCity;
		this.bridgeNumber = bridgeNumber;
		this.bridgeLength = bridgeLength;
		this.bridgeWidth = bridgeWidth;
	}

	public String getBridgeCity() {
		return bridgeCity;
	}

	public void setBridgeCity(String bridgeCity) {
		this.bridgeCity = bridgeCity;
	}

	public int getBridgeNumber() {
		return bridgeNumber;
	}

	public void setBridgeNumber(int bridgeNumber) {
		this.bridgeNumber = bridgeNumber;
	}

	public String getBridgeLength() {
		return bridgeLength;
	}

	public void setBridgeLength(String bridgeLength) {
		this.bridgeLength = bridgeLength;
	}

	public String getBridgeWidth() {
		return bridgeWidth;
	}

	public void setBridgeWidth(String bridgeWidth) {
		this.bridgeWidth = bridgeWidth;
	}

	@Override
	public String toString() {
		return "Bridge [bridgeCity=" + bridgeCity + ", bridgeNumber=" + bridgeNumber + ", bridgeLength=" + bridgeLength
				+ ", bridgeWidth=" + bridgeWidth + "]";
	}

}
