import java.util.Stack;
public class stacksDemo {

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);

        //It return and remove first element from stack
        System.out.println("before pop : "+st);
        st.pop();
        System.out.println("after pop : "+st);

        //Used to return first element in stack
        System.out.println(st.peek());

        System.out.println(st.search(20));
        System.out.println(st.empty());
    }
}