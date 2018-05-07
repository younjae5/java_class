package kr.ac.kookmin.cs.oop.object;

public class FinalStatic {
  public static final String KOOKMIN_UNIV_OFFICIAL_NAME = "Kookmin University";
  public static final String KMU_ADDRESS = "Jeonnung Ro 77, Seokngbuk Gu";
  private final String birthNation = "Korea";
  private final String birthYear;
  
  private String name;
  
  
  public FinalStatic(String birthYear, String name) {
    this.birthYear = birthYear;
    this.name = name;
    
  }
  
  
  
   //finalÀÇ »ç¿ë
  public void setBirthYear(String birthYear, String name) {
    //this.birthYear = birthYear;
    this.name = name;
  }
  
  
  

}
