package String;

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Corner case
        if (number <= 1) {
            return false;
        }

        // Check from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If number is divisible by i, then it is not a prime number
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
