package Encapsulation;
class Temperature{
    private Double celsius;

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }
    public Double getCelsius() {
        return celsius;
    }
    public Double getFahrenheit(){
        return (celsius*9/5)+32;
    }
}
public class temp_converter {
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.setCelsius(23.5);
        System.out.println("Temperature in Celsius : "+obj.getCelsius()+"C");
        System.out.println("Temperature in Fahrenheit :"+obj.getFahrenheit()+"F");
    }
}
