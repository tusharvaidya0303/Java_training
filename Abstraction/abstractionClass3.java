package Abstraction;

abstract class AnimalSounds{
      abstract void soo (String s);
      void Method(){
          System.out.println("new Sound");
      }
}
class dogVoice1 extends AnimalSounds{
    void soo(String s ){
        System.out.println("Dog Voice :"+s);
    }
}
class catVoice1 extends  AnimalSounds{
    void soo (String s){
        System.out.println("Cat Voice : "+s);
    }
}
public class abstractionClass3 {
    public static void main(String[] args) {
        AnimalSounds obj =new dogVoice1();
        obj.soo("Bark");
        obj.Method();
        AnimalSounds obj2 = new catVoice1();
        obj2.soo("Meow");
        obj.Method();

    }
}
