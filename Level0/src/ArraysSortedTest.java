import java.util.Arrays;

public class ArraysSortedTest {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 3 };
        
        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        // 반대로 ( 내림차순 )
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length-1) - i] = temp;
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}
