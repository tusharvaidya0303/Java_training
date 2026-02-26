package Inheritance;
class Book{
    void read(){
        System.out.println("Reading a Book.");
    }
}
class Novel extends Book{
    void storyLine(){
        System.out.println("Its a Novel with good storyline.");
    }
}
public class Single_level_3 {
    public static void main(String[] args) {
        Novel obj = new Novel();
        obj.read();
        obj.storyLine();
    }
}
