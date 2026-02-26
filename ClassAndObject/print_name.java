package ClassAndObject;
class fullname{
    String firstname="Tushar";
    String lastNmae="Vaidya";
     void full(){
        System.out.println(firstname+" "+lastNmae);
    }
}
public class print_name {
    public static void main(String[] args) {
        fullname obj=new fullname();
        obj.full();
    }
}
