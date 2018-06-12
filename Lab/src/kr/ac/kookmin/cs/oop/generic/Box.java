package kr.ac.kookmin.cs.oop.generic;

public class Box<T> {
    private T type;
    
    public T getType() {
        return type;
    }
    
    public void setType(T type) {
        this.type = type;
    }
    
    public static void main(String[] args) {
        Box<String> boxString = new Box<String>();
        Box<Integer> boxInteger = new Box<>();
        //long과 int는 바로 stack에 쌓이는 원시형 변수
        //Long과 Integer는 참조형 변수(heap에 값이 저장) --> 원시형 변수보다 속도는 느리다(하지만 class선언이 가능하기때문에 class가 갖는 모든 특성을 가질 수 있다)
        boxString.setType("String generic");
        boxInteger.setType(123);
    }

}
