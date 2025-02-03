public class Pass_Pillow {
    public int passThePillow(int n, int time) {

        int round = time/(n-1); // Number of jump
        int ans = 0;

        if(round%2 == 0){
            ans = (1+time%(n-1));
        }else{
            ans = (n - time%(n-1));
        }

        return ans;

    }
    public static void main(String[] args) {
        Pass_Pillow p = new Pass_Pillow();
        System.out.println(p.passThePillow(3, 2));
    }
}
