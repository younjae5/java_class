package kr.ac.kookmin.cs.oop.object;

public class AccessModifier {
  private String name;
  private String id;
  int year;
  
  public String phoneNumber;
  
  public void setName(String name) {
    if (name.length() == 1) {
      return;
    
    }
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
