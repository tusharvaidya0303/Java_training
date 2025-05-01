package ClassAndObject;
class student{
    String firstname;
    int age;
    student(String s,int a){
        firstname =s;
        age =a;
        System.out.println(firstname+" "+age);
    }

}
public class Const_ructer {
    public static void main(String[] args) {
        student obj = new student("Tushar",22);
        student obj2 = new student("Rahul",21);
    }
}

