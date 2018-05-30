package homework_last;

public class Animal {
   public String name;
   public String type;
   public int age;
   
   //Constructor 설정
   public Animal(){
       this.name = "unknown";
       this.type = "unknown";
       this.age = 0;
   }
   
   public Animal(String name, String type, int age){
       this.name = name;
       this.type = type;
       this.age = age;
   }
   
   //toString method 설정
   public String toString(){
       String sen = "저는 " + this.type + "입니다. 제 이름은 " + this.name + "입니다. 제 나이는 " + String.valueOf(age) +"살 입니다.";   
       return sen;
   }
   
}

