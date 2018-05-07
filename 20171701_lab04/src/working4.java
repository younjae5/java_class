import java.util.Scanner;

public class working4 {
    public static void main(String args[]) {
        int[] gradeList;
        Scanner input = new Scanner(System.in);

        int total;
        int sum = 0;

        do {
            System.out.print("Enter the total number of Studnets : ");
            total = input.nextInt();
            if (total < 0) {
                System.out.print("Please retry input.\n");
                System.out.print("Enter the total number of Studnets : ");
                total = input.nextInt();
            }
        } while (total <= 0);

        gradeList = new int[total];

        for (int i = 0; i < gradeList.length; i++) {
            System.out.print("Enter the grade : ");
            gradeList[i] = input.nextInt();
            while (gradeList[i] < 0) {
                System.out.print("Please retry input.\n");
                System.out.print("Enter the grade : ");
                gradeList[i] = input.nextInt();
            }
            sum = sum + gradeList[i];

        }

        for (int i = 0; i < gradeList.length; i++) {
            System.out.print(i + " Student's grade is: " + gradeList[i] + "\n");
        }

        double average = sum / total;
        System.out.print("Student's Average is: " + average);

    } // end of main()
} // end of class
