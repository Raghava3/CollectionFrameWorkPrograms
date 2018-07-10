package com.raghava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class IteratorClass {
	
	public static void main(String[] raghava)
	{
	
	
				
		//creatign arraylist
		ArrayList arrayList=new ArrayList();
		
		for (int i=0;i<10;i++)
		{
			//adding into arraylist object
			arrayList.add(i);
		}
		
		//creating the iterator object
		Iterator iterator=arrayList.iterator();
		
		//checking that next element is present or not
		while(iterator.hasNext())
		{
		//getting the element and checking  if even number 	then remove in next line
			if(((int)iterator.next())%2==0)
			{

		// removing the object
				iterator.remove();
			}
		}
	
	
		System.out.println(arrayList);
		
	

}
	}