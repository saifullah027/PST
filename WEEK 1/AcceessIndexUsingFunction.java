import java.util.function.Function;

public class AcceessIndexUsingFunction {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        Function<Integer, Integer> IndexValue = index -> numbers[index];

        int index = 2;
        System.out.println("Element at index " + index + " is: " + IndexValue.apply(index));
    }
}
