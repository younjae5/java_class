package kr.ac.kookmin.cs.oop.object;

public class StudentTest {
    public static void main(String[] args) {
        Student kmuLee = new Student("KMU Lee");
        System.out.println(kmuLee.getName());
        System.out.println(kmuLee.getAddress());

        Student kookminKim = new Student("Kookmin Kim", "Seoul Jeongnueng");
        System.out.println(kookminKim.getName());
        System.out.println(kookminKim.getAddress());

        kookminKim.setAddress("Dormitory B");
        System.out.println(kookminKim.getAddress());

        kookminKim.addCourseScore("Object Oriented Programming", 89);
        kookminKim.addCourseScore("Software Project", 57);
        kookminKim.addCourseScore("Liner Algebra", 96);
        kookminKim.printScores();

        System.out.printf("The average score is %.2f%n", kookminKim.getAverageScore());
    }
}
