package kmu.oop.practice.lab4.theater;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

public class TheaterType {
	public String name;
	int level;
	String lname[];
	int size[];

	// Test1: fill the following constructor for class TheaterType by setting up 4 variables 
	//        whose values are coming through 4 arguments.
	public TheaterType(String name, int level, String lname[], int size[])
	{
		this.name = name;
		this.level = level;
		this.lname = lname;
		this.size = size;				
	}
}
