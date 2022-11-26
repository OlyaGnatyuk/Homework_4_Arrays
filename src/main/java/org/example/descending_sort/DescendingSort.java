package org.example.descending_sort;

public class DescendingSort {
    public static void main(String[] args) {
        int nums[] = {91, 88, 78, 55, 49, 45, 17, 15, 13, 1};
        int firstNumber = nums[0];
        boolean sorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > firstNumber) {
                sorted = false;
                break;
            }
            firstNumber = nums[i];
        }

        if (sorted) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован по убыванию");
        }
    }
}
