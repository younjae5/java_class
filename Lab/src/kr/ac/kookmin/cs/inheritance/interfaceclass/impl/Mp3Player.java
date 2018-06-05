package kr.ac.kookmin.cs.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.inheritance.interfaceclass.MusicPlayable;

public class Mp3Player implements MusicPlayable{
    
    @Override
    public void play() {
        System.out.println("Mp3 player: Playing a song");
    }
    
    @Override
    public void stop() {
        System.out.println("Mp3 player: Stopping a song");
    }

}
