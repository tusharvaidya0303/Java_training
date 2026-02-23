public class typeCasting {
    public static void main(String[] args) {
        short a = 5;
        byte b = (byte) a;
        System.out.println(b); // 5

        byte b1 = 127;
        b1++;
        System.out.println(b1); // -128 because of overflow 

        byte b2 = -128;
        b2--;
        System.out.println(b2); // 127 because of underflow

        byte b3 = 100;
        int i = b3; // implicit casting (widening)
        System.out.println(i); // 100

        byte b4 = (byte) 130; // explicit casting (narrowing)
        System.out.println(b4); // -126 because of overflow 256-130 = 126

        double d = 9.78;
        int i2 = (int) d; // explicit casting (narrowing)
        System.out.println(i2); // 9

        float f = 3.14f;
        int i3 = (int) f; // explicit casting (narrowing)  
        System.out.println(i3); // 3

        char c = 'A';
        int i4 = c; // implicit casting (widening)
        System.out.println(i4); // 65 (ASCII value of 'A')

        char c2 = (char) 66; // explicit casting (narrowing)
        System.out.println(c2); // 'B' (character representation of ASCII value 66


    }
}
