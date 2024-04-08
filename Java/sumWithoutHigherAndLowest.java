import java.util.Arrays;

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 2) {
            return 0;
        }

        Arrays.sort(numbers);

        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 2, 1, 8, 10};
        System.out.println("Sum: " + sum(numbers1)); // Output: 16

        int[] numbers2 = {1, 1, 11, 2, 3};
        System.out.println("Sum: " + sum(numbers2)); // Output: 6
    }
}
