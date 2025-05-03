package ClassAndObject;
class Book{
    String title;
    String author;
    Double price;
//    constructor
    Book(String title,String author,Double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
//    method for discount
    void display(){
        double discount = price * 0.10;
        double finalPrice = price - discount;

        System.out.println("Title of the Book is :"+title);
        System.out.println("The Author is :"+author);
        System.out.println("Price of the book is :"+price);
        System.out.println("After 10% discount the final price is :"+finalPrice);
    }
}
public class Book_Discount {
    public static void main(String[] args) {
        Book obj = new Book("A Dance with Dragon","George R.R Martine",200.00);
        obj.display();
    }
}
