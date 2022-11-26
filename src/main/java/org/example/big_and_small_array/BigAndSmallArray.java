package org.example.big_and_small_array;

public class BigAndSmallArray {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 9, 7, 5, 3, 1};
        int sumElementsOfArray = 0;
        for (int i = 0; i < nums.length; i++) {
            sumElementsOfArray += nums[i];
        }

        if (sumElementsOfArray > 100) {
            System.out.println("Это большой массив");
        } else if (sumElementsOfArray < 100) {
            System.out.println("Это маленький массив");
        } else {
            System.out.println("Сумма элементов равна 100");
        }
    }
}
