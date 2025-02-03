package Arrayss;

import java.util.Arrays;

public class Binary_Search {

    public int[] binary_search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0) {
            if(arr[row][col] == target) {
                return new int[]{row, col};
            }
            else if(arr[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49}
        };
        int target = 37;
        Binary_Search bs = new Binary_Search();
        int[] ints = bs.binary_search(arr, target);
        System.out.println(Arrays.toString(ints));
    }
}
