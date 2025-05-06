package Polymorphism;
class Animal{
    void speak(){
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        super.speak();
        System.out.println("Dog Barks");
    }
}
public class animal_OR {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.speak();
    }
}
