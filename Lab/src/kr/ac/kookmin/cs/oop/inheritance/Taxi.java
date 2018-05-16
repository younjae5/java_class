package kr.ac.kookmin.cs.oop.inheritance;

public class Taxi extends Car {
  @Override
  public int run() {
      System.out.println("Taxi is running");
      return 1;
  }
}