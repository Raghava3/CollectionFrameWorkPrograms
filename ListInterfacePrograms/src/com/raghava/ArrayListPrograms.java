package com.raghava;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPrograms {
	
	public static void main(String[] args)
	{
	
		Integer a=5;
		
		ArrayList arrayList=new ArrayList();
		arrayList.add(a);
		arrayList.add(1, 2);
		
		LinkedList linkedList=new LinkedList();
		linkedList.add("this is linked list");
		
		arrayList.addAll(linkedList);
		
		
	}

}
