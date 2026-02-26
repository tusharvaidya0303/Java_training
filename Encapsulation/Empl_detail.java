package Encapsulation;
class Employ{
    private int id;
    private String name;
    private Double salary;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Double getSalary() {
        return salary;
    }
    void display(){
        System.out.println("ID : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
    }
}
public class Empl_detail {
    public static void main(String[] args) {
        Employ obj = new Employ();
        obj.setId(101);
        obj.setName("Tony Stark");
        obj.setSalary(20000.00);
        obj.display();
    }
}
