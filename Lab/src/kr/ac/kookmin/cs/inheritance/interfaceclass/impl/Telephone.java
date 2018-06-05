package kr.ac.kookmin.cs.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.inheritance.interfaceclass.PhoneCallable;

public class Telephone implements PhoneCallable{
    @Override
    public void call(int number) {
        System.out.println("Wired phone call: "+ number);
    }
    @Override
    public void hangup() {
        System.out.println("hangup wired phone call");
    }
}
