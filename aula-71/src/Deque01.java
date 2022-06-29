import java.util.ArrayDeque;
import java.util.Deque;

public class Deque01 {
    
    public static void main(String[] args) {
        
        Deque<String> deque = new ArrayDeque<String>(5);

        deque.add("rivaldo");
        deque.add("kaka");
        deque.add("gilberto silva");
        deque.add("dida");

        for (String pic : deque) {
            System.out.println(pic);
        }

        System.out.println(deque.getLast());

        System.out.println(deque);

        deque.addFirst("denilson");

        System.out.println(deque);

        deque.addLast("roberto carlos");

        System.out.println(deque);

    }
}
