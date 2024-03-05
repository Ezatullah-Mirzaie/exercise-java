package interfac;
class Phone{
    public void call(){
        System.out.println("Phone call");}
    public void sms(){
        System.out.println("Phone sending SMS");}
}
   interface ICamera{
       void click();
       void record();
    }
   interface IMusicPlayer{
       void play();
       void stop();
   }
   class SmartPhone extends Phone implements ICamera,IMusicPlayer{
       public void voieCall(){
           System.out.println("Smart Phone video calling");}
       public void click(){
           System.out.println("Smart phone is clicking phone");}
       public void record(){
           System.out.println("Smart phone is recording video");}
       public void play(){
           System.out.println("Smat phone playing music");}
       public void stop(){
           System.out.println("Smart phone stopped playing");}
   }


public class Interfac {

    public static void main(String[] args) {
        SmartPhone s=new SmartPhone();
        s.sms();
        s.call();
        s.click();
        s.play();
        s.record();
        s.stop();
        s.voieCall();
    }   
}
