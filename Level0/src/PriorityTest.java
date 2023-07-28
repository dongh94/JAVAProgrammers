import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityTest {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : new int[] {a, b, c, d}) {
            if (map.containsKey(data))
                map.put(data, map.get(data) + 1);
            else map.put(data, 1);
        }

        PriorityQueue<Dice> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            pq.add(new Dice(key, map.get(key)));
        }

        int answer = 0;
        if (pq.size() == 1)
            answer = 1111 * pq.poll().data;
        else if (pq.size() == 2) {
            Dice maxDice = pq.poll();
            Dice minDice = pq.poll();
            if (maxDice.count == 3)
                answer = (int) Math.pow( 10 * maxDice.data * minDice.data, 2);
            else
                answer = (maxDice.data + minDice.data) * Math.abs(maxDice.data - minDice.data);
        } else if (pq.size() == 3) {
            Dice dice = pq.poll();
            answer = pq.poll().data * pq.poll().data;
        } else

            while (!pq.isEmpty()) {
                Dice poll = pq.poll();
                answer = poll.data;
            }
        return answer;
    }

    public class Dice implements Comparable<Dice> {
        int data;
        int count;

        public Dice(int data, int count) {
            this.data = data;
            this.count = count;
        }
        // 내가 기준 ( 기본이 오름 : 내가 크면 오른쪽으로 )
        @Override
        public int compareTo(Dice dice) {
            if (this.count == dice.count) {
                return dice.data - this.data;
            } else {
                return dice.count - this.count;
            }
        }
    }
    public static void main(String[] args) {

    }
}

