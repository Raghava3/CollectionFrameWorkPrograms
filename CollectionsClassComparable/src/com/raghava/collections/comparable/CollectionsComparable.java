package com.raghava.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsComparable {

	
	public static void main(String[] args)
	{
		ArrayList<Watch> arrayList=new ArrayList<Watch>();
		
		Watch watch=new Watch();
		watch.setDate(2);
		watch.setTime(2);
		
		Watch watch2=new Watch();
	    watch2.setDate(1);
	    watch2.setTime(2);

	    arrayList.add(watch);
	    arrayList.add(watch2);
	    
	    
	    //this is before sorting
	    
	    Iterator<Watch> iterator=arrayList.iterator();
	    
	    while(iterator.hasNext())
	    {
	    Watch w=(Watch)iterator.next();
	    System.out.println("this is date"+w.getDate());
	    System.out.println("this is time"+w.getTime());
	    }
	    
	    
	    Collections.sort(arrayList);
	    
        //this is after sorting
	    
	    Iterator<Watch> iterator1=arrayList.iterator();
	    
	    while(iterator1.hasNext())
	    {
	    Watch w=(Watch)iterator1.next();
	    System.out.println("this is date"+w.getDate());
	    System.out.println("this is time"+w.getTime());
	    }
	    
	    
		
		
	}
	
}

//this class implements comarable interface
class Watch implements Comparable<Watch>
{
	
	private int  time;
	private int date;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	//this is implementing the compareTo method
	@Override
	public int compareTo(Watch a) {

		if(this.date==a.date)
		{
			
			if(this.time<a.time)
			{
				return -1;
			}
			else if (this.time>a.time) {
				return +1;
			}
			else
			{
				return 0;
			}
			
		}
		else if(this.date<a.date)
		{
			return -1;
		}
		else
		{
			return +1;
		}
	}
	
	
	
}