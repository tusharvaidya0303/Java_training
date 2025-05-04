package Inheritance;
class Employee{
    void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("Manager is attending a meeting");
    }
}
public class Single_level {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.attendMeeting();
        obj.work();
    }
}
