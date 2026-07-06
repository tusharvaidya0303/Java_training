import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class queueDemo {
    public static void main(String[] args) {
        //1. LinkedList as Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);                   //add without exception
        q.offer(20);
        q.offer(30);
        System.out.println(q);          //[10, 20, 30]
        
        q.poll();                      //remove without exception
        System.out.println(q);         //[20, 30]

        System.out.println(q.peek());  //gets first element without exception

        //2. ArrayDeque as Queue
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.offer(10);                   //add without exception
        q2.offer(20);
        q2.offer(30);
        System.out.println(q2);          //[10, 20, 30]
        
        q2.poll();                      //remove without exception
        System.out.println(q2);         //[20, 30]

        //3. PriorityQueue
        Queue<Integer> q3 = new PriorityQueue<>();
        q3.offer(10);                   //add without exception
        q3.offer(20);
        q3.offer(30);
        System.out.println(q3);          //[10, 20, 30]
        
        q3.poll();                      //remove without exception
        System.out.println(q3);         //[20, 30]


        //
        Deque<Integer> q4 = new ArrayDeque<>();

        // Insert
        q4.offerFirst(10);   // Front
        q4.offerLast(20);    // Rear
        q4.offerFirst(5);

        System.out.println(q3);
        // [5, 10, 20]

        // Remove
        System.out.println(q4.pollFirst()); // 5
        System.out.println(q4.pollLast());  // 20

        System.out.println(q4);
        // [10]

        // Peek
        System.out.println(q4.peekFirst()); // 10
        System.out.println(q4.peekLast());  // 10

    }
}