public class Mean {
    public static void main(String[] args) {
        int[] data = {4, 7, 2, 7, 3, 5, 7};

        double average = getAverageValue(data);
        System.out.println("Average is " + average);
    }

    private static double getAverageValue(int[] data) {
        if (data == null || data.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int datum : data) {
            sum += datum;
        }

        return sum / data.length;
    }
}
