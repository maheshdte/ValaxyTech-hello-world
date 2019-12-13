package com.example;

public class BaseDriver {

	private static final String TEST_DATA_FOLDER = "TestData";
	private static final String FILE_PATH_SEPARATOR = "/";
	public String browser = System.getProperty("Browser");

	// Constructor
	public BaseDriver(String driver) {
		System.out.println("Driver:"+driver);
	}

}
