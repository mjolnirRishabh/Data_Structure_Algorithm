public class Leetcode_1769 {

    public static void main(String[] args) {
        String boxes = "001011";
        int[] result = minOperations(boxes);
        for (int operations : result) {
            System.out.print(operations + " ");
        }
    }

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        int count = 0, operations = 0;

        // Pass 1: Calculate operations from the left
        for (int i = 0; i < n; i++) {
            result[i] += operations;
            count += boxes.charAt(i) - '0'; // Count the balls
            operations += count;           // Increment operations
        }

        // Reset counters for the right pass
        count = 0;
        operations = 0;

        // Pass 2: Calculate operations from the right
        for (int i = n - 1; i >= 0; i--) {
            result[i] += operations;
            count += boxes.charAt(i) - '0'; // Count the balls
            operations += count;           // Increment operations
        }

        return result;
    }
}
