import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter frequency of values: ");

        String[] input = scanner.nextLine().split(" ");
        HashMap<String, Integer> modeMap = new HashMap<>();

        operateInputStream(input, modeMap);

        printMostFrequentElements(modeMap);
    }

    private static void printMostFrequentElements(HashMap<String, Integer> modeMap) {

        if (modeMap.isEmpty()) {
            System.out.println("No data to process.");
            return;
        }

        int maxFrequency = 0;
        for (int frequency : modeMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        for(Map.Entry<String, Integer> entry : modeMap.entrySet()) {
            if (entry.getValue() == maxFrequency)
            {
                System.out.println(entry.getKey() + " appears " + maxFrequency + " times.");
            }
        }

    }

    private static void operateInputStream(String[] input, HashMap<String, Integer> modeMap) {
        for (String element : input) {
            modeMap.put(element, modeMap.getOrDefault(element, 0) + 1);
        }
    }
}
