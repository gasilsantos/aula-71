import java.util.PriorityQueue;

public class Queue01 {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> names = new PriorityQueue<String>();
        
        names.add("filermino");
        names.add("quebence");
        names.add("torim");

        System.out.println(names);

        System.out.println(names.peek());

        System.out.println(names);

        System.out.println(names.poll());

        System.out.println(names);
    }

}
