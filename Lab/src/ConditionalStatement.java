
public class ConditionalStatement {
	public static void main(String[] args) {
		int score = 85;
		if (score >= 90) {
			System.out.println("Grade A");
		}
		if (score >= 80 && score < 90) {
			System.out.println("Grade B");
		}
		
		if (score >= 90) {
			System.out.println("Grade A");
		}else {
			System.out.println("Grade B");
			
		}
		
		
		
		
		if (score >= 90) {
			System.out.println("Grade A");
		}else if (score >= 80) {
			System.out.println("Grade B");
		}else if (score >= 70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}		
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("Grade A+");
			}
			else {
				System.out.println("Grade A");
			}
		}
		
		int num = (int) (Math.random() * 6) + 1;
        switch (num) {
            case 1:
                System.out.println("Dice number 1");
                break;
            case 2:
                System.out.println("Dice number 2");
                break;
            case 3:
                System.out.println("Dice number 3");
                break;
            case 4:
                System.out.println("Dice number 4");
                break;
            case 5:
                System.out.println("Dice number 5");
                break;
            default:
                System.out.println("Dice number 6");
                break;
        }
		
		
	    String day = "Wednesday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It is weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It is weekend");
                break;

        }
		
	}
	

}
