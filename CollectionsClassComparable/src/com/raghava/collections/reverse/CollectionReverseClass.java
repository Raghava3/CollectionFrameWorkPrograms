package com.raghava.collections.reverse;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseClass {

	public static void main(String[] args)
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add("vasdfsadf");
		arrayList.add("aasfasdfadsf");
		arrayList.add("aasdfasdf");
	
		Collections.reverse(arrayList);
		
		System.out.println(arrayList);
		
	}
}
