package ClassAndObject;
class Student{
    String name;
    int rollNumber;
    int marks;

//    Constructor.
    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

//    Method/function.
    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Marks : "+marks);
        System.out.println("-------------------------");
    }
}
public class Student_Detail {
    public static void main(String[] args) {
//   making object
        Student obj1=new Student("Tushar",18,22);
        Student obj2=new Student("Ketan",12,25);
        Student obj3=new Student("Nabeel",13,20);
//   Call
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
}
