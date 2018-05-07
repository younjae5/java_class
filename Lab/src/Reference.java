
public class Reference {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println("Array length is "+ scores.length);
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		System.out.println("scores : " + scores); //scores라는 이름의 stack에 적혀있는 heap의  메모리주소값
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("Sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("Average : " + avg);
		
		
		
		
		
		
		int[] arr1 = new int[3];
		for( int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i <arr1.length; i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]);
		}
		
		
		String[] arr3 = new String[3];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "Jan.";
		arr3[1] = "Feb.";
		arr3[2] = "March";
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		
		String name = "object oriented programming";
		System.out.println(name);
		
		char thirdChar = name.charAt(2);
		System.out.println(thirdChar);
		
		
		String subject1 = new String ("object oriented programming");
		String subject2 = "open source software";
		boolean isSubject1Same = name.equals(subject1);
		boolean isSubject2Same = name.equals(subject2);
		boolean equalCheck = name == subject1; //stack에 있는 주솟값을 비교한다
		System.out.println("subject1 : "+ (name == subject1) + " subject2 : " + equalCheck);
		
		int indexOfProgram = name.indexOf("programming");
		System.out.println(indexOfProgram);
		System.out.println(name.indexOf("software"));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(7, 15));
		
		System.out.println(name.toUpperCase());
		System.out.println("KOOKMIN UNIV".toLowerCase());
		
		
		int[][] multiScores = {{90, 80, 95}, {100, 80, 90}};
		int mScores1[][] = null;
		mScores1 = new int[2][3];
		
		for(int i = 0; i < multiScores.length; i++) {
			for(int j = 0; j < multiScores[i].length; j++) {
				System.out.println(i + " X " + j + " : " + multiScores[i][j]);
			}
		}
		
		
		
		String[] courses = null;
		courses = new String[] {"Java", "Software", "C++"};
		for(String course : courses) {
			System.out.println(course);
		}
		
		for(int[] ss : multiScores) {
			for(int s : ss) {
				System.out.println(s);
			}
		}
		
		
	}

}
