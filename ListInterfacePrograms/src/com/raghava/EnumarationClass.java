package com.raghava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationClass {
	
	
	public static void main(String[] raghava)
	{
	//creating vetor object	
	Vector<Object> vector=new Vector<Object>();
		
	for (int i=0;i<10;i++)
	{
		//adding into vector object
		vector.add(i);
	}
		
	for(int i=0;i<5;i++)
	{
		//adding vector object
		vector.add("student"+i);
	}
	
	//enumaration for vector to retrive the element one by one
	Enumeration<Object> enumeration=vector.elements();
	
	//checking is there next element exist or not
	while(enumeration.hasMoreElements())
	{
		//get the next element
		System.out.println(enumeration.nextElement());
	}
		
	}

}
