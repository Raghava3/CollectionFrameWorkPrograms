package com.raghava;

import java.util.List;
import java.util.ArrayList;

class Parent
{
	public String value="parent";

	public String getValue() {
		return value;
	}

}

class Child extends Parent
{
	public String value="child";

	public String getValue() {
		return value;
	}

	
}

public class Test {

	public static void main(String[] raghav)
	{
//		Parent child=new Child();
//		System.out.println(child.value+child.getValue());

		List<Asteroid> asteroids = new ArrayList<Asteroid>();
		
		asteroids.add(new Asteroid("sylvia",286));
		asteroids.add(new Asteroid("pallas", 512));
		asteroids.add(new Asteroid("Eunomia",268));
		asteroids.add(new Asteroid("juno",258));
		asteroids.add(new Asteroid("Hygia",431));
		asteroids.add(new Asteroid("Davida",289));
		
		Asteroid c= asteroids.stream().reduce(asteroids.get(0),(a, b) -> a.getDiameter() > b.getDiameter() ? a:b);
        System.out.println(c);



		
	}
}
