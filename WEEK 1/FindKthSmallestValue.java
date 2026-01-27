import java.util.Arrays;

public class FindKthSmallestValue {
    public static void main(String[] args) {
        int[] numbers = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        if (k > 0 && k <= numbers.length) {
            System.out.println("The " + k + "th smallest value is: " + numbers[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}