package kr.ac.kookmin.cs.oop.object;

public class GetterSetter {
  private int speed = 0;
  boolean stopped = false;
  
  public boolean isStopped() {
    return stopped;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    }
    else {
      this.speed = speed;
    }
  }
  
  /*
  public static void main(String[] ags) {
    GetterSetter car = new GetterSetter();
    System.out.println(car.getSpeed());
    car.setSpeed(100);
    System.out.println(car.getSpeed());
  }
  */

}
