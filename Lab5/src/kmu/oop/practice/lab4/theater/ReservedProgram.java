package kmu.oop.practice.lab4.theater;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

public class ReservedProgram extends TheaterProgram {
	boolean reserved[][];
	
	// Test5: set up 3 variables with incoming arguments, and then, construct
	// 2-dimensional variables(sold[][] and reserved[][]) followed by initializing as 'false'.
	public ReservedProgram(TheaterType type, String program, int admissionFee[])
	{
		super(type, program, admissionFee);
		
		reserved = new boolean[type.level][];
		for(int i=0; i < type.level; i++)
		{
			this.reserved[i] = new boolean[type.size[i]];
			for(int j=0; j<type.size[i]; j++)
				this.reserved[i][j] = false;
		}		
	}
	
	// Test6: mark the seat reserved out with 'true'
	public boolean reserve(String level, int position)
	{
		reserved[changeLevel(level)][position-1] = true;
		
		return true;
	}
	
	// Test7: compute the total # of vacant seats that are neighter sold nor reserved.
	public int vacantSeat() {
		int sum=0;
		
		for(int i=0; i < sold.length; i++)
			for(int j=0; j < sold[i].length; j++)
				if(!(sold[i][j] || reserved[i][j]))
					sum ++;
		
		return sum;		
	}

	public String seatStatus(String level, int position)
	{
		String res;
		
		if(sold[changeLevel(level)][position-1]) res="Sold";
		else if(reserved[changeLevel(level)][position-1]) res="Reserved";
		else res="Vacant";
		
		return res;
	}
	
	// Test8: compute the total expected income yielded by selling or reserving tickets
	public int expectedIncome() {
		int sum=0;
		
		for(int i=0; i < sold.length; i++)
			for(int j=0; j < sold[i].length; j++)
				if(sold[i][j] || reserved[i][j])
					sum += admissionFee[i];
		
		return sum;
	}
		
}
