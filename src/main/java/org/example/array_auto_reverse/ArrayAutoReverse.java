package org.example.array_auto_reverse;

public class ArrayAutoReverse {
    public static void main(String[] args) {
        int nums[] = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums.length - 1 - i;
            System.out.print(nums[i] + " ");
        }
    }
}
