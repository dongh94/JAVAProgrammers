public class test {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries[0].length];
        int idx = 0;
        for (int[] q : queries) {

            int min_v = 1_001;
            for (int i = q[0]; i <= q[1]; i++ ) {
                if (i > q[2] && min_v > arr[i])
                    min_v = arr[i];
            }
            if (min_v == 1_001)
                min_v = -1;

            answer[idx++] = min_v;
        }
        return answer;
    }
}