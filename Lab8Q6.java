package javaapplication11;
abstract class Phone{
    abstract void call();
    abstract void sms();
}
interface Camera{abstract void click();
abstract void record();}
interface MusicPlayer{
abstract void play();
abstract void pause();
abstract void stop();}
class Smartphone extends Phone implements Camera,MusicPlayer{
    void call(){System.out.println("Call");}
    void sms(){System.out.println("SMS");}
    public void click(){System.out.println("Click");}
    public void record(){System.out.println("Record");}
    public void play(){System.out.println("Play");}
    public void pause(){System.out.println("Pause");}
    public void stop(){System.out.println("Stop");}
}    
public class Lab8Q6 {
    public static void main(String args[]){
    Smartphone sp=new Smartphone();
    sp.call();
    sp.sms();
    sp.click();
    sp.record();
    sp.pause();
    sp.play();
    sp.stop();
    }
}
