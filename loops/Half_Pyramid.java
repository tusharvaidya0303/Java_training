package loops;

public class Half_Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Inverted ");


        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
