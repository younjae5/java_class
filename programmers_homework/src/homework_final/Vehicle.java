package homework_final;

public class Vehicle {
    abstract class Vehicle {
        public String titleNumber;
        public String owner;
        public int todayMileage;  

        public Vehicle(){
            this.titleNumber = "";
            this.owner = "";
            this.todayMileage = 0;
        }
        public Vehicle(String titleNum, String owner, int todayM){
            this.titleNumber = titleNum;
            this.owner = owner;
            this.todayMileage = todayM;
        }
        
        public void setTitleNum(String titleNum){
            this.titleNumber = titleNum;
        }
        public void setOwner(String owner){
            this.owner = owner;
        }
        public void setTodayM(int todayM){
            this.todayMileage = todayM;
        }
        
        public String getTitleNum(){
            return this.titleNumber;
        }
        public String getOwner(){
            return this.owner;
        }
        public int getTodayM(){
            return this.todayMileage;
        }
        
        abstract double drivingTime();
        public double todayKm(){
            return this.todayMileage * 1.6;
        }
    }

     

    class Car extends Vehicle{
        int mileage;
        public Car(){
            this.mileage = 0;
        } 

        public Car(String titleNum, String owner, int todayM, int mileage){
            super(titleNum, owner, todayM);
            this.mileage = mileage;
        }

        public void setMileage(int mileage){
            this.mileage = mileage;
        }


        public int getMileage(){
            return this.mileage;
        }
       
        public double drivingTime(){
            return this.todayMileage / 40;
        }
       
       public void addMileage(){
            this.mileage += this.todayMileage;
        }
    }

     

    class Bike extends Vehicle{
        String model;
        public Bike(){
            this.model = "";
        }  

        public Bike(String titleNum, String owner, int todayM, String model){
            super(titleNum, owner, todayM);
            this.model = model;
        }

        public void setModel(String model){
            this.model = model;
        }

        public String getModel(){
            return this.model;
        }

        public double drivingTime(){
            return this.todayMileage / 7;
        }
    }

     

    // 아래 부분은 지우지 마세요

    class Solution {
      public int solution(int ignore) {
          int answer = 0;
          return answer;
      }
    }

}
