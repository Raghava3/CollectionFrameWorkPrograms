package com.raghava.HashTablePrograms;

import java.util.Hashtable;

class Temp
{
	int i;

	public Temp(int i)
	{
		this.i=i;
	}
	
	
	// based on this hashcode value the data will be added
	@Override
	public int hashCode() {
		return i%9;
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return i+"";
}
}

public class HashtableClass {

	
	public static void main(String[] raghav)
	{
		
		Hashtable hashtable=new Hashtable();
		
		hashtable.put(new Temp(5),"A");
		hashtable.put(new Temp(2),"B");
		hashtable.put(new Temp(6),"C");
		hashtable.put(new Temp(15),"D");
		hashtable.put(new Temp(23),"E");
		hashtable.put(new Temp(16),"F");

		//output will be from top to bottom and right to  left
       System.err.println(hashtable);



		
		
	}
	
	
}
