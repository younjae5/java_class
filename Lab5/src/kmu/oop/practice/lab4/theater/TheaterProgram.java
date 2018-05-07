package kmu.oop.practice.lab4.theater;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

public class TheaterProgram {
	public TheaterType type;
	public String program;
	boolean sold[][];
	int admissionFee[];
//	static DoubleFor df;
	static Common df;

	// Test2: set up 3 variables with incoming arguments, and then, construct
	// 2-dimensional variable(sold[][]) followed by initializing as 'false'.
	public TheaterProgram(TheaterType type, String program, int admissionFee[])
	{
		this.type = type;
		this.program = program;
		this.admissionFee = admissionFee;
		this.sold = new boolean[type.level][];
		for(int i=0; i < type.level; i++)
		{
			this.sold[i] = new boolean[type.size[i]];
			for(int j=0; j<type.size[i]; j++)
				this.sold[i][j] = false;
		}	
	}
	
//	static public void setDoubleFor(DoubleFor df)
	static public void setDoubleFor(Common df)
	{
		TheaterProgram.df = df;
	}
	
	public int vacantSeat() {
		int sum=0;
		
		for(int i=0; i < sold.length; i++)
			for(int j=0; j < sold[i].length; j++)
				if(!sold[i][j])
					sum ++;
		
		return sum;		
	}

	public int changeLevel(String level)
	{
		int res=-1;
		
		switch(level)
		{
			case "Royal":
				res=0;
				break;
			case "Premium":
				res=1;
				break;
			case "Economy":
				res=2;
				break;
			default:
		}
		
		return res;
	}

	// Test3: mark the seat sold out with 'true'
	public boolean sell(String level, int position)
	{
		sold[changeLevel(level)][position-1] = true;
		
		return true;
	}
	
	public String seatStatus(String level, int position)
	{
		String res;
		
		if(sold[changeLevel(level)][position-1]) res="Sold";
		else res="Vacant";
		
		return res;
	}
	
	// Test4: compute the total income yielded by selling tickets
	public int income() {
		int sum=0;
		
		for(int i=0; i < sold.length; i++)
			for(int j=0; j < sold[i].length; j++)
				if(sold[i][j])
					sum += admissionFee[i];
		
		return sum;
	}
	
}

