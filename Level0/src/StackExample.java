import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if(stack.isEmpty()) {
                stack.push(a);
                continue;
            }
            while (!stack.isEmpty() && a <= stack.peek()) {
                stack.pop();
            }
            stack.push(a);
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[answer.length - 1 - i] = stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        int[] solution = stackExample.solution(new int[]{1, 4, 2, 5, 3});
        System.out.println(Arrays.toString(solution));
    }
}
