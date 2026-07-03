public class leftAlign_half_pymd {
    void printPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void printInvertedPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void numInvertedPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void AlphabetPymd(int n){
        for (int i = 1; i<=n ; i ++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    void AlphabetInvertedPymd(int n){
        for (int i = n; i>=1 ; i--){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    void AlphabetSamePymd(int n){
        char c = 'A';
        for (int i = 1; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(c+j-1));
            }
            System.out.println();
        }
    }
    void ReverseAlphabetPymd(int n){
        char c = 'A';
        for (int i = 1; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(c+(n-i)+(j-1)));
                
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
        System.out.println("Alphabet");
        obj.AlphabetPymd(5);
        System.out.println("Inverted Alphabet");
        obj.AlphabetInvertedPymd(5);
        System.out.println("Same Alphabet");
        obj.AlphabetSamePymd(5);
        System.out.println("Reverse Alphabet");
        obj.ReverseAlphabetPymd(5);
    }
}
