package kmu.oop.practice.lab4.theater;

import java.io.*;

public class Theater {
	
	TheaterType type;
	ReservedProgram program;
	
	public Theater(TheaterType type, ReservedProgram program)
	{
		this.type = type;
		this.program = program;
	}
		
	public void setProgram(ReservedProgram program) {
		this.program = program;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	        final String dosCommand = "cmd /c dir /s";
//	        final String location = "C:\\WINDOWS\\system32";
        final String dosCommand = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
        final String location = "http://www.sacticket.co.kr/SacHome/ticket/seriesAndFestivalDetail?pfmNo=4318";
        try
	        {
	            final Process process = Runtime.getRuntime().exec(dosCommand + " " + location);
	            final InputStream in = process.getInputStream();
	            int ch;
	            while((ch = in.read()) != -1)
	            {
	                System.out.print((char)ch);
	            }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
				
		// (Test1) testing constructor function for class "TheaterType"
		String lname1[] =  {"Royal", "Premium", "Economy"};
		int size1[] = {10, 30, 60};
		TheaterType type1 = new TheaterType("Mordern Theater", 3, lname1, size1);
		System.out.println("\n(Test1) TheaterType(name, level, lname[], size[])");
		System.out.print("          --> name=" + type1.name + ", level=" + type1.level);
		System.out.print(", lname[]= { "); for(int i=0; i<type1.level; i++) System.out.print(type1.lname[i] + (i==type1.level-1 ? "" : ", ")); 
		System.out.print(" }, size[]= { "); for(int i=0; i<type1.level; i++) System.out.print(type1.size[i] + (i==type1.level-1 ? "" : ", "));
		System.out.println(" }");

		// (Test2) testing constructor function for class "TheaterProgram"		
		int admissionFee0BB[] = { 1000, 600, 300};
		TheaterProgram program0BB = new TheaterProgram(type1, "Beauty and Beast0", admissionFee0BB);
		System.out.println("\n(Test2) TheaterProgram(type, program, admissionFee[])");
		System.out.print("          --> type=" + ((type1==program0BB.type) ?  "yes" : "no") + ", program=\"" + program0BB.program + "\"");
		System.out.print(", admissionFee[]= { "); for(int i=0; i<program0BB.type.level; i++) System.out.print(program0BB.admissionFee[i] + (i==type1.level-1 ? "" : ", "));
		System.out.println(" }");
		
		// (Test3 & 4) testing function <sell> & <income> for class "TheaterProgram"	
		System.out.print("\n(Test3 & 4) TheaterProgram::sell() & income()\n   --> (before selling 3 tickets) ");
		System.out.print("seatStatus(\"Royal\", 10)=" + program0BB.seatStatus("Royal", 10) + ", seatStatus(\"Premium\", 30)=" + program0BB.seatStatus("Premium", 30)  + ", seatStatus(\"Economy\", 60)=" + program0BB.seatStatus("Economy", 60) + ":: vacantSeat=" + program0BB.vacantSeat() + ", income=" + program0BB.income()); 
		program0BB.sell("Royal", 10);
		program0BB.sell("Premium", 30);
		program0BB.sell("Economy", 60);
		System.out.print("\n   --> (after selling 3 tickets) ");
		System.out.println("seatStatus(\"Royal\", 10)=" + program0BB.seatStatus("Royal", 10) + ", seatStatus(\"Premium\", 30)=" + program0BB.seatStatus("Premium", 30)  + ", seatStatus(\"Economy\", 60)=" + program0BB.seatStatus("Economy", 60) + ":: vacantSeat=" + program0BB.vacantSeat() + ", income=" + program0BB.income()); 
				
		// (Test5) testing constructor function for class "ReservedProgram"		
		int admissionFee1G[] = { 120000, 80000, 40000};
		ReservedProgram program1G = new ReservedProgram(type1, "Ghost", admissionFee1G);
		System.out.println("\n(Test5) ReservedProgram(type, program, admissionFee[])");
		System.out.print("          --> type=" + ((type1==program1G.type) ?  "yes" : "no") + ", program=" + program1G.program);
		System.out.print(", admissionFee[]= { "); for(int i=0; i<program1G.type.level; i++) System.out.print(program1G.admissionFee[i] + (i==type1.level-1 ? "" : ", "));
		System.out.println(" }");
		
		// (Test6 & 7 & 8) testing function <reserve> & <vacantSeat> & <expectedIncome> for class "ReservedProgram"	
		int admissionFee1BB[] = { 150000, 90000, 50000};
		ReservedProgram program1BB = new ReservedProgram(type1, "Beauty and Beast 2017", admissionFee1BB);
		System.out.println("\n(Test6 & 7 & 8) TheaterProgram::reserve() & vacantSeat() & expectedIncome()");
		System.out.print("          --> type=" + ((type1==program1BB.type) ?  "yes" : "no") + ", program=" + program1BB.program);
		System.out.print(", admissionFee[]= { "); for(int i=0; i<program1BB.type.level; i++) System.out.print(program1BB.admissionFee[i] + (i==program1BB.type.level-1 ? "" : ", "));
		System.out.println(" }");
		System.out.print("   --> (before selling/reserving 6 tickets) ");
		System.out.print("seatStatus(\"Royal\", 10)=" + program1BB.seatStatus("Royal", 10) + ", seatStatus(\"Premium\", 30)=" + program1BB.seatStatus("Premium", 30)  + ", seatStatus(\"Economy\", 60)=" + program1BB.seatStatus("Economy", 60) + ":: vacantSeat=" + program1BB.vacantSeat() + ", expectedIncome=" + program1BB.expectedIncome()); 
		program1BB.sell("Royal", 4);
		program1BB.sell("Premium", 23);
		program1BB.sell("Economy", 55);
//		program1BB.reserve("Royal", 10);
//		program1BB.reserve("Premium", 30);
//		program1BB.reserve("Economy", 60);
		System.out.print("\n   --> (after selling/serving 6 tickets) ");
		System.out.print("seatStatus(\"Royal\", 10)=" + program1BB.seatStatus("Royal", 10) + ", seatStatus(\"Premium\", 30)=" + program1BB.seatStatus("Premium", 30)  + ", seatStatus(\"Economy\", 60)=" + program1BB.seatStatus("Economy", 60) + ":: vacantSeat=" + program1BB.vacantSeat() + ", expectedIncome=" + program1BB.expectedIncome()); 
		
	}

}
