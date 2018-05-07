package kmu.oop.practice.lab4.theater;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ArtHall {

	int size;
	TheaterType type[];
	ReservedWebProgram program[];
	String theaterName;

	public ArtHall(int size, TheaterType type[], ReservedWebProgram program[])
	{
		this.size = size;
		this.type = type;
		this.program = program;
		// (Test4) implements constructor for class ArtHall

	}

	public void showTheaterProgram(String theaterName)
	{
		this.theaterName = theaterName;
		for (int a =0; a<type.length; a++){
			if (type[a].name.equals(theaterName)){
				program[a].showURL();
				break;
			}
		}

		// (Test6) implements the method showTheaterProgram() located at class ArtHall via theater name
		//         hint: use String comparison method "equals()" & "showURL()"

	}

	public int updateProgram(String theaterName, ReservedWebProgram program)
	{
		int i;
		i=0;
		for (int a=0; a<type.length; a++){
			if (type[a].name.equals(theaterName)){
				this.program[a] = program;
			}
		}
		// (Test8) implements the method updateProgram() located at class ArtHall with theater name & new program(program4)
		return i;
	}


	public static void main(String[] args) {

		// (exercise) executes Google Chrome
		String dosCommand =
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";

		String chromdOption =  "-window-size=2000,1040 --window-position=3800,400 --force-device-scale-factor=0.3";
		try
		{
			final Process process = Runtime.getRuntime().exec(dosCommand+chromdOption);
			final InputStream in = process.getInputStream();
			int ch;
			while((ch = in.read()) != -1)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		// (Test1) implements constructor for class ReservedWebProgram
		//           for first TheaterType(type1) & its own program(program1) applying the data for "Turandot"
		String lname1[] =  {"R", "S", "A", "B", "C"};
		int size1[] = {100, 300, 600, 600, 600};
		TheaterType type1 = new TheaterType("Concert Hall", 5, lname1, size1);
		int admissionFee1[] = { 150000, 120000, 90000, 60000, 30000};
		String URL1 = "http://www.sacticket.co.kr/SacHome/ticket/seriesAndFestivalDetail?pfmNo=4318";
		ReservedWebProgram program1 = new ReservedWebProgram(type1, "Turandot", admissionFee1, URL1);

		// (Test2) initialize second TheaterType(type2) & its own program(program2) applying the data for "Talk & Concert"
		String lname2[] =  {"R","S","A"};
		int size2[] = {100, 300, 600};
		TheaterType type2 = new TheaterType("IBK Chamber Hall", 3, lname2, size2);
		int admissionFee2[] = {50000,30000,20000};
		String URL2 = "http://www.sacticket.co.kr/SacHome/ticket/seriesAndFestivalDetail?pfmNo=2387";
		ReservedWebProgram program2 = new ReservedWebProgram(type2,"Talk & Concert",admissionFee2, URL2);

		// (Test3) initialize third TheaterType(type3) & its own program(program3) applying the data for "Regoletto"
		String lname3[] =  {"R", "S", "A", "B", "C","D"};
		int size3[] = {100,300,600,600,600,600};
		TheaterType type3 = new TheaterType("Opera Theater",6,lname3,size3);
		int admissionFee3[] = {150000,120000,80000,50000,30000,10000};
		String URL3 = "https://www.sacticket.co.kr/SacHome/perform/detail?searchSeq=32267";
		ReservedWebProgram program3 = new ReservedWebProgram(type3,"Regoletto",admissionFee3, URL3);

		// (Test4) implements constructor for class ArtHall
		TheaterType type[] = { type1, type2, type3 };
		ReservedWebProgram program[] = { program1, program2, program3, };
		ArtHall ah = new ArtHall(3, type, program);



		// (Test5) implements the method showURL() located at class ReservedWebProgram via program index "myint"
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println(type[0].name);
			System.out.print("Enter Theater No((1) Concert Hall, (2) IBK Chamber Hall, (3) Opera Theater), (-1) exit : ? ");
			int myint = keyboard.nextInt();
			if(myint == -1) break;
			ah.program[myint-1].showURL();
		} while(true);



		// (Test6) implements the method showTheaterProgram() located at class ArtHall via theater name
		ah.showTheaterProgram("Opera Theater");


		// (Test7) updates upon TheaterType(type1) by new program(program4) applying the data for "Anna NetRebko & Yusif Eyvazof Super Concert"
		int admissionFee4[] = {350000,270000,190000,140000,70000};
		String URL4 = "https://www.sacticket.co.kr/SacHome/perform/detail?searchSeq=33981";
		ReservedWebProgram program4 = new ReservedWebProgram(type1, "Anna NetRebko & Yusif Eyvazof Super Concert",admissionFee4, URL4);



		// (Test8) implements the method updateProgram() located at class ArtHall with theater name & new program(program4)
		int res;
		if((res = ah.updateProgram("Concert Hall", program4)) >= 0)
			ah.program[res].showURL();

	}
