package kr.ac.kookmin.cs.oop.object;

public class EconomicTire extends Tire {
  public EconomicTire(int maxRotation) {
    super(maxRotation);
  }
  
  @Override
  protected void incrementRotation() {
    accumulatedRotation += 2;
  }

}
