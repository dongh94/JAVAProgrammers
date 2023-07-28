import java.util.PriorityQueue;

public class PriorityTest3 {

    public static int solution(int[] rank, boolean[] attendance) {

        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();


    }

    public static void main(String[] args) {
        int answer = solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false});
        System.out.println("answer = " + answer);
    }
}
