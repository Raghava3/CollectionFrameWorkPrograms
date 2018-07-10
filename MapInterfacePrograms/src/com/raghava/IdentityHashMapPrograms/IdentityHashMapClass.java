package com.raghava.IdentityHashMapPrograms;

import java.util.IdentityHashMap;

public class IdentityHashMapClass {
	
	public static void main(String[] args)
	{
	
		IdentityHashMap identityHashMap=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		//identity hashmap uses == operator. it compares the reference
		//so output will be
//		{10=tiger, 10=lion}

		identityHashMap.put(i1, "lion");
		identityHashMap.put(i2, "tiger");
		
		System.out.println(identityHashMap);
		
		
		}

}
