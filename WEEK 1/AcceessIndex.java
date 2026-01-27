import java.util.Scanner;

public class AcceessIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scn = new Scanner(System.in);
        System.out.println("Array elements:");

        System.out.print("Enter the index of the array you want to access (0-4): ");
        int index = scn.nextInt();
        System.out.println("Element at index " + index + " is: " + numbers[index]);
    }
}
