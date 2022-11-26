package org.example.sorted_or_unsorted_array;

public class SortedOrUnsortedArray {
    public static void main(String[] args) {
        int nums[] = {100, 88, 78, 55, 50, 45, 17, 16, 13, 1};
        int previousNumber = nums[0];
        Boolean orderIsAsc = null;
        boolean sorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (orderIsAsc == null) {
                if (previousNumber > nums[i]) {
                    orderIsAsc = false;
                }
                if (previousNumber < nums[i]) {
                    orderIsAsc = true;
                }
            } else {
                if (orderIsAsc) {
                    if (nums[i] < previousNumber) {
                        sorted = false;
                        break;
                    }
                } else {
                    if (nums[i] > previousNumber) {
                        sorted = false;
                        break;
                    }
                }
            }

            previousNumber = nums[i];
        }

        if (sorted) {
            System.out.println("Элементы массива отсортированы");
        } else {
            System.out.println("Элементы массива не отсортированы");
        }
    }
}
