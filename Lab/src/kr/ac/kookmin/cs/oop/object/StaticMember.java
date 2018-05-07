package kr.ac.kookmin.cs.oop.object;

public class StaticMember {
  String color;
  static double pi = 3.141592;
  
  static int times(int x, int y) {
    return x * y;
  }
  
  void setColor(String color) {
    this.color = color;
  }

}
