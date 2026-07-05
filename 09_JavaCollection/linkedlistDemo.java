import java.util.LinkedList;

public class linkedlistDemo {
    public static void main(String[] args) {
        
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(100);
        System.out.println(ll);
        // ll.removeFirst();
        // ll.removeLast();

        //Used to return first element in linkedlist
        System.out.println(ll.peek());

        //It return and remove first element from list
        System.out.println("before poll : "+ll);
        ll.poll();
        System.out.println("after poll : "+ll);

    }
}
