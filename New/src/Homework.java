public class Homework {
    private int balance;   //계정의 잔액
    private int accountID; //계정번호
    private static final int MAX_WITHDRAW = 100000; //최대 인출금액
    
    public Homework(int accountID){
        this(accountID, 0);
    }
    
    public Homework(int accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }
    
    //get method
    public int getBalance(){
        return this.balance;
    }
    public int getAccountID(){
        return this.accountID;
    }
    
    //withdraw method (1)
    public boolean withdraw(int amount){
        if(amount > this.balance) {return false;}
        if(amount > this.MAX_WITHDRAW) {return false;}
        if(0 >= amount) {return false;}
        this.balance -= amount;
        return true;
    }
    
    //withdraw method(2)
    public boolean withdraw(){
        return withdraw(10000);
    }  
    
    //desposit function
    public boolean deposit(int amount){
        if(amount <= 0) { return false; }
        this.balance += amount;
        return true;            
    }
    
}

// 절대 주의!!!!! 아래 코드는 수정하지 마세요. 지워서도 안됩니다.
class Solution {
  public int solution(int ignore) {
      int answer = 0;
      return answer;
  }
}