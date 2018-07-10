package com.raghava.PropertiesPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	
	
	public static void main(String[] args) throws IOException
	{
		Properties properties=new Properties();
		FileInputStream fileInputStream=new FileInputStream("src\\resources\\abc.properties");
		properties.load(fileInputStream);
		System.out.println(properties);
		String s=properties.getProperty("raghav");
		System.out.println(s);
		
		String s1=(String) properties.setProperty("raghav", "10");
		System.out.println(s1);
		
		FileOutputStream fileOutputStream=new FileOutputStream("src\\resources\\abc.properties");
		properties.store(fileOutputStream,"raghav=100");
	}
}