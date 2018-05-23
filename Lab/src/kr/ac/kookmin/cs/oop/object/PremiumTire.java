package kr.ac.kookmin.cs.oop.object;

public class PremiumTire extends Tire{
  public PremiumTire(int maxRotation) {
    super(maxRotation);
  }
  
  @Override
  protected void incrementRotation() {
    //절반의 확률로 마모정도를 축적
    if(Math.random() < 0.5) {
      ++accumulatedRotation;
    }
  }
}

