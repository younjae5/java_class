package kr.ac.kookmin.cs.oop.inheritance;

public class EqualsOverride {
  private String name;
  public EqualsOverride(String name) {
    this.name= name;
  }
  
  public String getName() {
    return name;
  }
  
  public static void main(String[] args) {
    EqualsOverride eo1 = new EqualsOverride(new String("leeky"));
    EqualsOverride eo2 = new EqualsOverride(new String("leeky"));
    
    System.out.println(eo1.getName());
    System.out.println(eo2.getName());
    
    System.out.println(eo1 == eo2);
    System.out.println(eo1.equals(eo2));
  }
  
  @Override
  public boolean equals(Object obj) {
    // check if input obj is EualsOverride object using instanceof
    // obj instanceof EqualsOverride
    // if not, return false
    // If true, check if name field value is the same
    if(obj instanceof EqualsOverride) {
      if(this.getName().equals(((EqualsOverride)obj).getName())) {
        return true;
      }
    }
    
    return false;
    

  }
}
