package programmers_homework;

public class Circle {
  double radius;
  String color;
  static double PI = 3.141592;
  
  Circle(){
      this.radius = 1.0;
      this.color = "red";
  }
  
  public Circle(double radius){
      this.radius = radius;
      this.color = "red";
  }
  
  public Circle(double radius, String color){
      this.radius = radius;
      this.color = color;
  }
  
  //get method
  public double getRadius(){
      return this.radius;
  }
  public String getColor(){
      return this.color;
  }
  
  public double getArea(){
      return (this.radius * this.radius * PI);
  }
}

