package kr.ac.kookmin.cs.oop.inheritance;

public class InterfaceExample {
    public interface ABC{
        void methodOne();
    }
    interface PQR extends ABC{
        void methodTwo();
    }
    // extends는 상속 관계일때, implements는 interface를 구현할때 사용
    public abstract class XYZ implements PQR{
        public void methodOne() {
            methodTwo();
        }
    }
    
    public class MNO extends XYZ{
        public void methodTwo() {
            methodOne();
        }
    }
    
    public void sample() {
        ABC abc = new MNO();
        //XYZ는 methodTwo가 구현되어있지 않기때문에
        //new XYZ처럼 새로운 객체 선언이 안된다
        abc.methodOne();
    }

}
