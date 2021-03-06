package com.raghava.WeakHashMapPrograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

class Temp
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "temp";
	}
	
	 @Override
	protected void finalize() throws Throwable {
	
		 System.out.println("excecuting finalize method");
	 }
}

public class WeakHashMapClass {
	
	public static void main(String[] raghav)
	{
		
		
		
		//this is Hashmap 
		HashMap hashMap=new  HashMap();  
		//object is created  
		Temp temp=new Temp();
		hashMap.put(temp, "raghav");
		
		//output is {temp=raghav}
		 System.out.println(hashMap);
			
		
		//making refence object null  and called garbage collector
		temp=null;
		System.gc();
		
		
		// output is {temp=raghav}
		 System.out.println(hashMap);
		 
		 
		 
		 //this is weak hashmap
		 
		 WeakHashMap hashMap2=new WeakHashMap();
		 
		 //creating the object of temp
		 Temp temp2=new Temp();
		 
		 //adding object to weakhashmap
		 hashMap2.put(temp2, "raghav");
		 
		 //output {temp=raghav}
		 System.out.println(hashMap2);
		 
		 // now making reference object to null
		 temp2=null;
		 System.gc();
		 
		 System.out.println(hashMap2);
		 
		 
		 
		 
		 
		
		
				
	}

}
