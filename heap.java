import java.util.*;
public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(3);
        heap.add(2);
        heap.add(1);
        heap.add(5);
        heap.add(4);
        heap.add(6);
        System.out.println(heap);
    }
}
