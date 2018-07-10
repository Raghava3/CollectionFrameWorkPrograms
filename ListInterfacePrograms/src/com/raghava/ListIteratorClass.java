package com.raghava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorClass {
	
	public static void main(String[] raghava)
	{
		//creatign linkedlist
				LinkedList linkedList=new LinkedList();
				
				for (int i=0;i<10;i++)
				{
					//adding into linkedlist object
					linkedList.add(i);
				}
				
				
				ListIterator iteratorClass= linkedList.listIterator();
				
				while(iteratorClass.hasNext())
				{
					System.out.println(iteratorClass.next());
					
					
				}
				
				
				System.out.println(linkedList); 
	}

}
