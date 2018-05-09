package programmers_homework;

public class BankAccount{
  int balance;
  int accountID;
  static final int MAX_WITHDRAW = 100000;

  public BankAccount(int accountID){
      this.accountID = accountID;
      this.balance = 0;
  }

  public BankAccount(int accountID, int balance){
      this.accountID = accountID;
      this.balance = balance;
  }

  public int getBalance(){
      return this.balance;
  }

  public int getAccountID(){
      return this.accountID;
  }

  public boolean withdraw(int amount){
      if (amount < this.balance && amount < MAX_WITHDRAW && amount > 0){
          this.balance -= amount;
          return true;
      }else {
          return false;
      }
  }

  public boolean withdraw(){
      if (10000 < this.balance && 10000 < MAX_WITHDRAW){
          this.balance -= 10000;
          return true;
      }else {
          return false;
      }
  }
  
  public boolean deposit(int amount){
      if (amount > 0){
          this.balance += amount;
          return true;
      }else{
          return false;
      }
  }
}

