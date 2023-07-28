import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // HashSet 사용 예제
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("kiwi");
        hashSet.add("apple"); // 중복된 원소는 추가되지 않음
        System.out.println("HashSet: " + hashSet);

        // TreeSet 사용 예제
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        System.out.println("TreeSet: " + treeSet);

        // LinkedHashSet 사용 예제
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add('a');
        linkedHashSet.add('b');
        linkedHashSet.add('c');
        linkedHashSet.add('b'); // 중복된 원소는 추가되지 않음
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
