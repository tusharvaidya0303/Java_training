package Interface;

interface Client {
    void print();
    void show();
}
class Dev implements Client{
    @Override
    public void print() {
        System.out.println("Print the Bill");
    }

    @Override
    public void show() {
        System.out.println("Show the Menu");
    }
}
class Main {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();
    }
}
