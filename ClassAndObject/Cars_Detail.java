package ClassAndObject;
class Car{
    String brand;
    int model;
    int price;

//    constructor
    Car(String brand,int model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
//    method
    void display(){
        System.out.println("Brand of Car is : "+brand);
        System.out.println("Model of Car is : "+model);
        System.out.println("Price of Car is : "+price);
        System.out.println("-----------------------------");
    }
}
public class Cars_Detail {
    public static void main(String[] args) {
        Car obj1 = new Car("Audi",2025,5000000);
        Car obj2 = new Car("BMW",2024,10000000);
        Car obj3 = new Car("Toyota",2023,2000000);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
