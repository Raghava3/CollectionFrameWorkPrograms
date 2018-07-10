package com.raghava.HashMapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	
	public static void main(String[] raghava)
	{
		HashMap hashMap=new HashMap();
		
		hashMap.put("lion", 1);
		hashMap.put("tiger", 2);
		
		//this method return key in set
		System.out.println(hashMap.keySet());
		
		//this method return value in collection
		System.out.println(hashMap.values());
		
		//this will give entry set
		System.out.println(hashMap.entrySet());
		
		Set s=hashMap.entrySet();
		
		Iterator iterator=s.iterator();
		
		while(iterator.hasNext())
		{
			

			// casting iterator object to map.entry
			Map.Entry m1=(Map.Entry)iterator.next();
			
			
			System.out.println(m1.getKey()+"  " + m1.getValue());
			
			if(m1.getKey().equals("lion"))
			{
			
				iterator.remove();
			}
		}
		
		
		System.out.println(hashMap);
		}
	
}
