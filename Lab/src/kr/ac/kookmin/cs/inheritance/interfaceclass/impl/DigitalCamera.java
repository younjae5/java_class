package kr.ac.kookmin.cs.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.inheritance.interfaceclass.PhotoTakable;

public class DigitalCamera implements PhotoTakable {
    
    @Override
    public void takeShot() {
        System.out.println("Taking a pircture using DigitalCamera");
    }    

}
