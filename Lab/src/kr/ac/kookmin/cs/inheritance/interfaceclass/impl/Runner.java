package kr.ac.kookmin.cs.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.inheritance.interfaceclass.MusicPlayable;
import kr.ac.kookmin.cs.inheritance.interfaceclass.PhoneCallable;
import kr.ac.kookmin.cs.inheritance.interfaceclass.PhotoTakable;

public class Runner{
    public static void main(String[] args) {
        PhoneCallable phone = new CellPhone();
        phone.call(29104220);
        
        MusicPlayable mp3Player = new Mp3Player();
        mp3Player.play();
        mp3Player.stop();
        
        mp3Player = new SmartPhone();
        mp3Player.play();
        mp3Player.stop();
        
        PhotoTakable camera = new DigitalCamera();
        camera.takeShot();
        
        SmartPhone smartPhone = new SmartPhone();
        camera = smartPhone;
        
        smartPhone.takeShot();
        camera.takeShot();
    }

}
