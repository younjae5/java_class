package kr.ac.kookmin.cs.oop.object;

public class CarConstructor {
  String modelName;
  String manufacturer;
  int modelYear;
  
  public CarConstructor() {
    this.modelName = "apollo";
    this.manufacturer = "KMU";
    this.modelYear = 2006;
  }
  
  public CarConstructor(String model) {
    //this.(model, "KMU", 0);
    modelName = model;
    manufacturer = "KMU";
    modelYear = 0;
  }
  
  public CarConstructor(String model, String company, int year) {
    modelName = model;
    manufacturer = company;
    modelYear = year;
  }
  
  public CarConstructor(String model, String company) {
    this(model, company, 0);
  }
  
}
