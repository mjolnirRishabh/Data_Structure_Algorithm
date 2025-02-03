package String;

public class Rough {
    public static void main(String[] args) {

        String a = " Hello world ";
        System.out.println(a);
        System.out.println(a.trim());
        String[] split = a.trim().split("//s");
        for(String s : split) {
            System.out.println(s);
        }
    }
}
