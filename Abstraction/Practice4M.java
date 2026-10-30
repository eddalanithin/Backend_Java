package com.Abstraction;

public class Practice4M {
//    Difficulty: Mixed — medium
//            1. Create an abstract class named MediaPlayer.
//            2. Declare an abstract method play() returning void.
//            3. Declare another abstract method pause() returning void.
//            4. Create a concrete class named AudioPlayer that extends MediaPlayer.
//            5. Implement both abstract methods.
//
//            7. Compile the program and observe what happens.
//            8. Correct the program so that it compiles, then explain why the original
//              VideoPlayer declaration caused a compiler error.
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
    }
}
abstract class MediaPlayer{
    public MediaPlayer(){
        System.out.println(" abtract class Constructor call");
    }
    abstract void play();
    abstract void pause();
}
class AudioPlayer extends MediaPlayer{
    public AudioPlayer(){
        System.out.println(" sub class Constructor call");
    }
    @Override
    void play() {
       System.out.println("Playing Audio File");
    }
    @Override
    void pause() {
        System.out.println("Pausing Audio File");
    }
}
//6. Create a class named VideoPlayer that extends MediaPlayer but implements only play().
class VideoPlayer extends MediaPlayer{
    @Override
    void play() {
        System.out.println("Playing Video File");
    }

    @Override
    void pause() {
        System.out.println("Pausing Video File");
    }
}