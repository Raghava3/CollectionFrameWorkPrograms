package com.raghava.HashMapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IdentifyingTheAlpha {
	static int r=0;
	
	public static void main(String[] args)
	{
		String s ="nu1lABAAAACD";
		char[] a = s.toCharArray();
		
		HashMap hashMap=new HashMap();
		int i=0,k=0;
		 for(int j=1;j<a.length;j++)
		 {
			  if(hashMap.containsKey(a[j]))
			  {
	
                int l= (int) hashMap.get(a[j]);
                hashMap.put(a[j], ++l);
			   	
			  }
			  else
		    	{
				hashMap.put(a[j], 1);
			    }
			  
		 }		
System.out.println(hashMap);		
		
		
		
	}

}
