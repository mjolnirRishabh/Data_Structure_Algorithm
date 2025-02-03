package CodeChef;

import java.util.*;

class Digit_Sum_Parties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(findNextNumber(N));
        }
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int findNextNumber(int N) {
        int originalSum = digitSum(N);
        int originalParity = originalSum % 2; // 0 for even, 1 for odd

        int X = N + 1;
        while (true) {
            int sumX = digitSum(X);
            int parityX = sumX % 2;

            if (parityX != originalParity) {
                return X;
            }
            X++;
        }
    }
}
