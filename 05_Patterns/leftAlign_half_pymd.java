public class leftAlign_half_pymd {
    void printPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void numInvertedPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void printInvertedPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        leftAlign_half_pymd obj = new leftAlign_half_pymd();
        obj.printPymd(5);
        System.out.println("inverted");
        obj.printInvertedPymd(5);
        System.out.println("Number");
        obj.numInvertedPymd(5);
    }
}
