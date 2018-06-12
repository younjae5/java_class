package kr.ac.kookmin.cs.oop.exception;

public class Examples {
    public void nullPointerException() {
        String name = null;
        System.out.println(name.toString());
    }
    public void arrayIndexException() {
        String[] names = new String[5];
        System.out.println(names[6]);
    }
    
    public void handleNpe() {
        try {
            nullPointerException();
        } catch(NullPointerException npe) {
            System.out.println(npe);
            System.out.println(npe.getMessage());
            System.out.println("null address is referenced");
            
        } finally {//오류 발생 여부 상관없이 시행되는 코드
            System.out.println("handled null pointer exception");
        }
    }
    
    public void handleMultipleException() {
        try {
            nullPointerException();
            arrayIndexException();
        } catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        try {
            nullPointerException();
            arrayIndexException();
        } catch(NullPointerException npe) {
            System.out.println("null pointer exception");
        } catch(ArrayIndexOutOfBoundsException ob) {
            System.out.println("array index out of bounds");
        }
        
        
        //여러가지 exception을 한번에 잡을 때 사용법
        try {
            nullPointerException();
            arrayIndexException();
        } catch(RuntimeException re) {//catch(RuntimeException re)
            System.out.println(re);            
        }
    }
    
    
    public void throwCustomException() throws CustomException{
        try {
            nullPointerException();
        } catch (NullPointerException npe){
            throw new CustomException("Converting NPE to custom Exception");
        } finally {
            System.out.println("finally block execution");
        }
    }
    
    
    
    public static void main(String[] args) {
        Examples examples = new Examples();
        //examples.nullPointerException();
        //examples.arrayIndexException();
        //examples.handleNpe();
        try {
            examples.throwCustomException(); //try to catch and handle it
        } catch(CustomException ce) {
            //RuntimeException re
            //Exception e
        } finally {
            System.out.println("Code complete");
        }
    }

}
