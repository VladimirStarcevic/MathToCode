import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of array: ");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = convertToIntegersArray(input);

        sortArray(numbers);

        printArray(numbers);

        double medianValue = getMedianValue(numbers);
        System.out.println("The median value is: " + medianValue);
    }

    private static double getMedianValue(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int n = numbers.length;
        if (n % 2 == 0) {

            int midIndex1 = n / 2 - 1;
            int midIndex2 = n / 2;

            return (numbers[midIndex1] + numbers[midIndex2]) / 2.0;
        } else {
            int midIndex = n / 2;
            return numbers[midIndex];
        }
    }

    private static void printArray(int[] numbers) {
        System.out.println("\n==== Print array ====");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    private static int[] convertToIntegersArray(String[] input) {
        if(input == null || input.length == 0) {
            return new int[0];
        }

        int[] numbers = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        return numbers;
    }
}
