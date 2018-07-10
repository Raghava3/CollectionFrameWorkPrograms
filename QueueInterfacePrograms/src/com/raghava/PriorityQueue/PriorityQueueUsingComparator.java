package com.raghava.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsingComparator {
	
	public static void main(String[] args)
	{
		
		PriorityQueue priorityQueue=new PriorityQueue(12,new MyComparator());
		
		
		priorityQueue.offer("A");
		priorityQueue.offer("Z");
		priorityQueue.offer("L");
		priorityQueue.offer("B");
		
	System.out.println(priorityQueue);
	System.out.println(priorityQueue.poll());
	System.out.println(priorityQueue);
		
		
	}

}


class MyComparator implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		String a=(String)arg0;
		String b=arg1.toString();
		
		return b.compareTo(a);	
	}
	
	
	 
}