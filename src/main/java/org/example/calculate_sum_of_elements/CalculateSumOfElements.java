package org.example.calculate_sum_of_elements;

import java.util.concurrent.ThreadLocalRandom;

public class CalculateSumOfElements {
    public static void main(String[] args) {
        int lengthOfArray = 10;
        int nums[] = new int[lengthOfArray];
        int sumElementsOfArray = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(1, 100);
            sumElementsOfArray += nums[i];
        }

        System.out.print(sumElementsOfArray);
    }
}
