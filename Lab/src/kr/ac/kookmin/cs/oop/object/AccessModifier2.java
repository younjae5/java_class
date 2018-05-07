package kr.ac.kookmin.cs.oop.object;

public class AccessModifier2 {
  private String name;
  private String id;
  int year;
  public String phoneNumber;
  
  public AccessModifier myAccessModifier = new AccessModifier();
  
  public void setName(String name) {
    System.out.println(myAccessModifier.phoneNumber);
    this.name = name; 
  }
  
  protected String getId() {
    return id;
  }
  public void doHomework() {
    reviewClass();
  }
  
  private void reviewClass() {
    
  }

}
