package com.raghava.TressSetPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClass {
	
	
	
	public static void main(String[] args)
	{
		// this is default natural sorting order it implements comparable interface calls compareTo method 
		TreeSet set=new TreeSet();
	    set.add("a");
	    set.add("A");
//	    set.add(new Integer(10));//you will get class cast exception
//	    set.add(null);//null pointer exception
	    System.out.println(set);
	    
	    
	    //this is our own implementation so it implements comparator interface and overrides compare method
	    TreeSet set2=new TreeSet(new MyComparator());
	    set2.add(10);
	    set2.add(20);
	    set2.add(0);
	    set2.add(-1);
	    System.out.println(set2);
	}
		

}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {

		Integer i1=(Integer)arg0;
		Integer i2=(Integer)arg1;
		
		if(i1>i2)
		{
			//- beacuse it should come first 
			return -1;
		}
		else if(i1<i2)
		{
			//+ beacuse it should come after
			return +1;
		}
		else
			
			return 0;
	}

	
	
}