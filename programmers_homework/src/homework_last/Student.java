package homework_last;

public class Student {
    public String name;
    public String major;
    public int age;
    public double grade;
    
    //constructor
    public Student(String name, String major, int age, double grade){
        this.name = name;
        this.major = major;
        this.age = age;
        this.grade = grade;
    }
    
    //toString method
    public String toString(){
         return (this.major + "과에 다니는 " + String.valueOf(this.age) + "살 " + this.name + "입니다.");
    }
    
    //get method
    public String getMajor(){
        return this.major;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getGrade(){
        return this.grade;
    }
    
    //set method
    public void setMajor(String major){
        this.major = major;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
}


