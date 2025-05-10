package Encapsulation;
class Student{
    private String name;
    private Double marks;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
    public Double getMarks() {
        return marks;
    }

    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Marks : "+getMarks());
    }
}
public class Student_Detail {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Tushar Vaidya");
        obj.setMarks(88.8);
        obj.display();
    }
}
