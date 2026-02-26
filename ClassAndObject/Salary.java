package ClassAndObject;
class Employee{
    String name;
    double id;
    double salary;

    //constructor
    Employee(String name,double id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
//    method for salary increment
    void display(){
        double increment = salary * 0.05;
        double newSalary = salary + increment;
        System.out.println("Name of Employee :"+name);
        System.out.println("ID no. of employee :"+id);
        System.out.println("Old Salary is :"+salary);
        System.out.println("---------------------------");
        System.out.println("Salary after 5% increment is :"+newSalary);
    }
}
public class Salary {
    public static void main(String[] args) {
        Employee obj = new Employee("Rohit Sharma", 238753.00,20000.00);
        obj.display();
    }
}
