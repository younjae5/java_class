import java.io.IOException;

public class Loop {
	
	
	public static void main(String[] args) throws IOException{
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		/*
		//summing from 1 to ten
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		*/
		System.out.println("sum from 1 to 10 is " + sum);
	
		
		
		
		//multiplication table
		for ( int i = 1; i <= 9; i++) {
			System.out.println(i + "´Ü");
			for (int j = 1; j <= 9; j ++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		
		int index = 0;
		while (index <= 5) {
			System.out.println("index is " + index++);
		}
		
		
		while (true){
			int num = (int)(Math.random()*6)+ 1;
			if (num == 6) {
				break;
			}else {
				System.out.println("a number from a dice: " + num);
			}
		}
		
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // go to start line of loop
			}
			System.out.println(i);
		}
		
		int num1 = 0;
		do {
			num1 = (int)(Math.random() * 6) + 1;
			System.out.println("a number from a dice: " + num1);
		}while (num1 != 6);
		
		System.out.println("Exit from a dice");
		
		
		int outerIndex = 0;
		for (;;) {
			System.out.println(outerIndex++);
			if (outerIndex > 10) {
				break;
			}
		}//not good example 
		
		
		for (int outerIndex1 = 0; outerIndex1 <= 10; outerIndex1++) {
			System.out.println(outerIndex);
		}
	}

}
