package Inheritance;
class Person{
    void displayName(){
        System.out.println("Name : Tushar Vaidya");
    }
}
class Student extends Person{
    void displayClasses(){
        System.out.println("Branch : CSE");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Monitor is Checking Discipline");
    }
}

public class Multi_level {
    public static void main(String[] args) {
        Monitor obj = new Monitor();
        obj.displayName();
        obj.displayClasses();
        obj.checkDiscipline();
    }
}
