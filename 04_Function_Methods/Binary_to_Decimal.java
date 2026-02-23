public class Binary_to_Decimal {

    public static void binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * (int)Math.pow(2, power);
            power++;
            binary /= 10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binaryToDecimal(1010); // Example binary number 1010 (decimal 10)
    }
}
