package ClassAndObject;
class chain{
    String firstName;
    int age;
    chain(){
        System.out.println("Hello");
    }
    chain(String firstName){
        this();
        System.out.println(firstName);
    }
    chain(String firstName,int age){
        this(firstName);
        this.firstName=firstName;
        age=age;
        System.out.println(firstName+" "+age);
    }
}
public class Const_chaining {
    public static void main(String[] args) {
        chain obj=new chain("Tushar",22);

    }
}
