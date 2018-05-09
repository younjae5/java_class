package murach.games;

import java.util.Random;

public class NumberGame {
  
  //field 값은 private로 합시당
  private int upperLimit; 
  //랜덤해서 지정할 수
  private int number;
  //횟수
  private int guessCounter;
  
  
  //field 값 초기화는 constructor에서 하는 걸 추천
  public NumberGame(int upperLimit) {
    this.upperLimit = upperLimit;
    Random random = new Random();
    this.number = random.nextInt(upperLimit - 1) + 1;
    this.guessCounter = 1;    
  }
  
  
  
  //CorrectGuess method
  public int isCorrectGuess(int guess) {
    if(guess < this.number) {
      return -1;
    }else if(guess > this.number) {
      return 1;
    }else {
      return 0;
    }
  }
    
  
  //get method  
  //객제지향언어에서는 정보은닉의 장점이자 강점이다.
  //get set method 설정을 잘합시다 + 지향합니다
  public int getUpperLimit() {
    return this.upperLimit;
  }

  public int getNumber() {
    return this.number;
  }

  public int getGuessCounter() {
    return this.guessCounter;
  }

  public void incrementGuessCounter() {
    this.guessCounter += 1;
  }
  
 
  
  
}

