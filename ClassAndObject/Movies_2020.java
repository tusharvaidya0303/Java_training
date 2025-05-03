package ClassAndObject;
class Movie{
    String name;
    double rating;
    int releaseYear;
    
//    constructor
    Movie(String name,double rating,int releaseYear){
        this.name=name;
        this.rating=rating;
        this.releaseYear=releaseYear;
    }
//    method display
    void display(){
        System.out.println(name+"("+releaseYear+") - "+rating);
    }
}
public class Movies_2020{
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception",8.8,2010);
        Movie m2 = new Movie("Dune",8.1,2021);
        Movie m3 = new Movie("The Batman",7.9,2022);
        Movie m4 = new Movie("Avatar",7.8,2009);
        Movie m5 = new Movie("Oppenheimer",8.6,2023);

        Movie[] movies={m1,m2,m3,m4,m5};
        System.out.println("Movies after 2020 are :");
        for(Movie m: movies){
            if(m.releaseYear>2020){
                m.display();
            }
        }
    }
}
