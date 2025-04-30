package ClassAndObject;
import java.util.*;
class Area{
    void cals(int l,int w){
        int area=l*w;
        System.out.println("Area of rectangle is "+area );
    }
}
public class Area_of_Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle ");
        int l= sc.nextInt();
        System.out.print("Enter width of rectangle ");
        int w= sc.nextInt();
        Area obj=new Area();
        obj.cals(l,w);
    }
}
