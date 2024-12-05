package Stack;
import java.util.*;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println(st.isEmpty());
        System.out.println(st.size());

        while (!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }

    }

}
