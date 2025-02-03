package String;

public class Medium_7 {
    public int reverse(int x) {

        long reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;

    }
    public static void main(String[] args) {

        Medium_7 medium7 = new Medium_7();
        System.out.println(medium7.reverse(1534236469));
    }
}
