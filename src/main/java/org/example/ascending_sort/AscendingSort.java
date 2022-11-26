package org.example.ascending_sort;

import java.lang.reflect.Array;

public class AscendingSort {
    public static void main(String[] args) {
        int nums[] = {1, 13, 15, 17, 28, 45, 55, 78, 88, 91};
        int firstNumber = nums[0];
        boolean sorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < firstNumber) {
                sorted = false;
                break;
            }
            firstNumber = nums[i];
        }

        if (sorted) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован по возрастанию");
        }
    }
}
