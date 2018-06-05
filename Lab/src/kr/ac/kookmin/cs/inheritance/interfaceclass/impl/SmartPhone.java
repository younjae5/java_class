package kr.ac.kookmin.cs.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.inheritance.interfaceclass.MusicPlayable;
import kr.ac.kookmin.cs.inheritance.interfaceclass.PhoneCallable;
import kr.ac.kookmin.cs.inheritance.interfaceclass.PhotoTakable;

public class SmartPhone implements PhoneCallable, MusicPlayable, PhotoTakable {
    @Override
    public void takeShot() {
        System.out.println("Taking a photo from a Smartphone");
    }
    @Override
    public void play() {
        System.out.println("Play music from SmartPhone");
    }
    @Override
    public void stop() {
        System.out.println("Stop music");
    }
    @Override
    public void call(int number) {
        System.out.println(number + ": Call wireless");
    }
    @Override
    public void hangup() {
        System.out.println("hangup wireless");
    }
    

}
