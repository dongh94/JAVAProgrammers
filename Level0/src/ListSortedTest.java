import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ListSortedTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        Collections.sort(list);
        System.out.println("list.toString() = " + list.toString());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list.toString() = " + list.toString());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.intValue() - a.intValue());
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(3);
        System.out.println("reversePq.toString() = " + pq.toString());
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        PriorityQueue<Integer> reversePq = new PriorityQueue<>(Collections.reverseOrder());
        reversePq.add(5);
        reversePq.add(2);
        reversePq.add(8);
        reversePq.add(1);
        reversePq.add(3);
        System.out.println("reversePq.toString() = " + reversePq.toString());
        while (!reversePq.isEmpty()) {
            System.out.println(reversePq.poll());
        }
    }
}
