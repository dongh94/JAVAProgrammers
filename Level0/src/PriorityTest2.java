import java.util.PriorityQueue;


public class PriorityTest2 {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        // 1. true만 추린다.
        // 2. idx , grade : grade -> idx -> 10000 * 1등 idx

        PriorityQueue<Attendance> pq = new PriorityQueue<>();
        for (int i = 0; i < rank.length; i++) {
            pq.add(new Attendance(rank[i], i, attendance[i]));
        }


        int num = 10_000;
        while (!pq.isEmpty()) {
            Attendance a = pq.poll();
            if (!a.isJoin) continue;
            answer += a.id * num;
            num /= 100;
            if (num < 1) return answer;
        }
        return answer;
    }

    public class Attendance implements Comparable<Attendance> {
        int rank;
        int id;
        boolean isJoin;

        public Attendance(int rank, int id, boolean isJoin) {
            this.rank = rank;
            this.id = id;
            this.isJoin = isJoin;
        }

        @Override
        public int compareTo(Attendance other) {
            return this.rank - other.rank;
        }
    }

    public static void main(String[] args) {
        PriorityTest2 priorityTest2 = new PriorityTest2();
        int answer = priorityTest2.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false});
        System.out.println("answer = " + answer);

    }
}

