package org.example.print_all_elements_with_numbers;

public class PrintAllElementsWithNumbers {
    public static void main(String[] args) {
        int nums[] = {1, 4, 2, 7, 9, 1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " - " + nums[i]);
        }
    }
}
