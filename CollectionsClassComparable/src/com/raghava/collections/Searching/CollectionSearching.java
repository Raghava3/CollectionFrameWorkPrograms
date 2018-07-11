package com.raghava.collections.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSearching {

	public static void main(String[] args)
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add("vasdfsadf");
		arrayList.add("aasfasdfadsf");
		arrayList.add("aasdfasdf");
		
		Collections.sort(arrayList,new MyComparator());
		
		System.out.println(arrayList);
		
		//we have to mention the comparator which one we are using to perform compare operation
		
		int s=Collections.binarySearch(arrayList,"aasdfasd",new MyComparator());
		System.out.println(s);
		
		
		
		
		
		
	}
	
}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
	    return	s1.compareTo(s2);
	}

}