package kr.ac.kookmin.cs.oop.inheritance;

public class SmartWatch extends SmartPhone {
  public SmartWatch(String model, String color, String appMarket) {
    super(model, color, appMarket);
  }
  
  @Override
  public void runBrowser() {
    super.runBrowser();
    System.out.println
    ("Executing Smart Watch Browser");
    super.runBrowser();
  }
  
  public static void main(String[] args) {
    SmartWatch smartWatch = new SmartWatch
        ("apple", "yellow", "AppStore");
    smartWatch.powerOn();
    smartWatch.runBrowser();
    
    System.out.println(smartWatch instanceof SmartWatch);
    System.out.println(smartWatch instanceof SmartPhone);
    System.out.println(smartWatch instanceof CellPhone);
  }
  
  
}
