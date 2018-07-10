package com.raghava.LinkedHashMapPrograms;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args)
	{
		LinkedHashMap linkedHashMap= new LinkedHashMap();
		
		linkedHashMap.put("Lion", 1);
		linkedHashMap.put("tiger", 2);
		
		
		//here insertion order is preserved
		System.out.println(linkedHashMap);
		
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		
		linkedHashMap.put(i1,"Lion");
		linkedHashMap.put(i2,"tiger");
		
		//here o/p will be   {Lion=1, tiger=2, 10=tiger} even if we are adding 4 entry beacuse it 
		//uses .equals() method to compare the keys 
		//.equals method compares content  so content is same 10,10
		//so key is duplicate 
		System.out.println(linkedHashMap);
		
	}
}