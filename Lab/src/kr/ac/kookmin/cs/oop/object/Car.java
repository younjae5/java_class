package kr.ac.kookmin.cs.oop.object;

public class Car {
  Tire tires[];
  
  public Car() {
    tires = new Tire[4];
  }
  
  int run() {
    System.out.println("Four wheels are running");
    for(int i = 0; i< tires.length; i++) {
      if(tires[i].roll() == false) {
        return i;
      }
    }
    
    return 4;
  }
  
  public void replaceTire(int index, Tire tire) {
    tires[index] = tire;
  }
  /*
  @Override
  public String toString() {
    String outputString = "";
    for(int i = 0; i < tires.length; ++i) {
      outputString += i;
      outputString += " th tire remaining rotation = ";
      outputString += tires[i].getRemainingRotation();
      outputString += "\n";
      }
    
    return outputString;
  }*/
  
  public static void main(String args[]) {
    Car car = new Car();
    car.replaceTire(0, new Tire(10));
    car.replaceTire(1, new Tire(10));
    car.replaceTire(2, new EconomicTire(10));
    car.replaceTire(3, new PremiumTire(10));
    
    while(true) {
      int carStatus = car.run();
      if(carStatus != 4) {
        int tireIndex = (int) (Math.random() * 3); // 0, 1, 2
        Tire tireToReplace = null;
        if(tireIndex == 0) {
          tireToReplace = new Tire(10);
        } else if(tireIndex == 1) {
          tireToReplace = new PremiumTire(10);
        } else if(tireIndex == 2) {
          tireToReplace = new EconomicTire(10);
        }
        
        car.replaceTire(carStatus, tireToReplace);
      }
      System.out.println(car);
      //toString 메소드를 override하지않으면
      //기본적으로 heap주소값이 출력된다.
    }
  }
}