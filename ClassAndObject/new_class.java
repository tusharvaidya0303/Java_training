package ClassAndObject;
class Student{
    String name="Tushar";
    void sum(int a,int b){
        System.out.println(a+b);
    }
}
public class new_class {
    public static void main(String[] args) {
        Student obj=new Student();
        Student obj2=new Student();
        obj.sum(2,5);
        System.out.println(obj2.name);
    }
}
