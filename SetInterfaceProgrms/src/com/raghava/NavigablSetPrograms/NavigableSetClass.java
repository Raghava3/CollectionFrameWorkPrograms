package com.raghava.NavigablSetPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetClass {
	
	protected int i=0;
	
	public static void main(String[] args)
	{
		NavigableSet navigableSet= new TreeSet();
		
		navigableSet.add(1000);
		navigableSet.add(2000);
		navigableSet.add(3000);
		navigableSet.add(4000);
		
	System.out.println(navigableSet.ceiling(5000));//4000
	System.out.println(navigableSet.higher(3000));//4000
	System.out.println(navigableSet.floor(4000));//4000
	System.out.println(navigableSet.lower(5000));//4000
	System.out.println(navigableSet.last());
	System.out.println(navigableSet.first());
	
	
	
	
		
	}

}

