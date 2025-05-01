package ClassAndObject;
class kid{
    String firstName="Rahul";
    int age =20;
    kid(String firstName,int age){
        this.firstName=firstName;
        age=age;
        System.out.println(firstName+" "+age);
    }
}
public class this_kid {
    public static void main(String[] args) {
        kid obj=new kid("Tushar",22);
        System.out.println(obj.firstName);
        System.out.println(obj.age);
    }
}
