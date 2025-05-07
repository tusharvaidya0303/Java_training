package Polymorphism;
 //	Create a Person class with a displayDetails method that prints basic details (name, age).
//Create a Student class that overrides the displayDetails method to print additional details like grade and school name.


class Person {
    void displayDetails (){
        System.out.println("Name :Tushar ");
        System.out.println("Age : 21 ");
    }
}

class StudentDetails extends Person{
    void displayDetails(){
        super.displayDetails();
        System.out.println("Roll no. : 0246CS243D18");
        System.out.println("College : Global ");
        System.out.println("Marks : 84%");
    }
}


public class studentDetail_OR {
    public static void main(String[] args) {
        Person obj = new StudentDetails();
        obj.displayDetails();
    }
}
