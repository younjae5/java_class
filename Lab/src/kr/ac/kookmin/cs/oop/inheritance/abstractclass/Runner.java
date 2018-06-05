package kr.ac.kookmin.cs.oop.inheritance.abstractclass;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println("cat breath: " + animal.breathe());
        System.out.println("cat sound: " + animal.sound());
        
        animal = new Dog();
        System.out.println("dog breath: " + animal.breathe());
        System.out.println("dog sound: " + animal.sound());
    }

}
