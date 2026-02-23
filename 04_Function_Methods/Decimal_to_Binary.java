public class Decimal_to_Binary {
    public static void decimalToBinary(int decimal){
        int binary = 0;
        int power = 0;
        while(decimal > 0){
            int remainder = decimal % 2;
            binary += remainder * (int)Math.pow(10, power); // Append the remainder to the binary number
            decimal /= 2; // Divide the decimal number by 2
            power++;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimalToBinary(10); // Example decimal number 10 (binary 1010)
    }
}
