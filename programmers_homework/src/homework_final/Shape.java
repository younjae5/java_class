package homework_final;

public class Shape {

    interface IShape {
        public double computeArea();
    }

    class Circle implements IShape{
        int radius;
        
        //constructor
        public Circle(int radius){
            this.radius = radius;
        }
        public Circle(){
            this.radius = 0;
        }
        
        //computeArea
        public double computeArea(){
            return 3.14 *this.radius*this.radius;
        }
        public double computeArea(int radius){
            return  3.14 * radius * radius;
        }
        
        //get method
        public int getRadius(){
            return this.radius;
        }
        
        //set method
        public void setRadius(int radius){
            this.radius = radius;
        }
    }


    class Rectangle implements IShape{
        int width;
        int height;
        
        //constructor
        public Rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }
        public Rectangle(){
            this.width = 0;
            this.height = 0;
        }
        
        //computeArea
        public double computeArea(int width, int height){
            return this.width * this.height;
        }
        public double computeArea(){
            return (this.width * this.height);
        }
        
        // get method
        public int getWidth(){
            return this.width;
        }
        public int getHeight(){
            return this.height;
        }
        
        //set method
        public void setWidth(int width){
            this.width = width;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public void setWidthHeight(int width, int height){
            this.width = width;
            this.height = height;
        }
    }

    // 아래 코드는 수정하지 마세요.
    class Solution {
      public int solution(int ignore) {
          int answer = 0;
          return answer;
      }
    }
}
