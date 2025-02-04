package Rough;

import java.util.*;

public class W10_P1 {
    public static void main(String[] args) {

       int[] arr = {6,0,8,2,1,5};

       W10_P1 w = new W10_P1();
        System.out.println(w.maxWidthRamp(arr));
    }
        public int maxWidthRamp(int[] nums) {
            int n = nums.length;
            // Stack to store the indices in non-increasing order
            Deque<Integer> stack = new ArrayDeque<>();

            // Step 1: Build the stack with indices in non-increasing order of their values
            for (int i = 0; i < n; i++) {
                if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                    stack.push(i);  // Push only when the current value is smaller
                }
            }

            // Step 2: Iterate from the end of the array to find the max width ramp
            int maxWidth = 0;
            for (int j = n - 1; j >= 0; j--) {
                // As long as the current value at nums[j] is >= value at the stack's top
                while (!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {
                    maxWidth = Math.max(maxWidth, j - stack.pop());
                }
            }
            return maxWidth;
        }
    }
