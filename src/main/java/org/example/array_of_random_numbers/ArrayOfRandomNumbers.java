package org.example.array_of_random_numbers;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int lengthOfArray = 20;
        int nums[] = new int[lengthOfArray];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.print(nums[i] + " ");
        }
    }
}
