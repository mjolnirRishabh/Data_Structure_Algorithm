package Arrayss;

public class Searching {

    public int search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {6, 8, 9}
        };
        int target = 8;
        Searching searching = new Searching();
        int search1 = searching.search(arr, target);
        System.out.println(search1);


    }
}
