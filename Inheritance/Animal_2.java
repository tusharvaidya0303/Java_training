package Inheritance;

public interface Animal_2 {
    void makeSound();
}
    class Dog_1 implements Animal_2{
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }
class main_2{
    public static void main(String[] args) {
        Dog_1 obj = new Dog_1();
        obj.makeSound();
    }
}
