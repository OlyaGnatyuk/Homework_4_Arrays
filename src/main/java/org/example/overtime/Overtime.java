package org.example.overtime;

import java.util.Map;

public class Overtime {
    private static final Map<Integer, Integer> daysDictionary = Map.of(
            1470098, 1,
            206655, 2,
            46001, 3,
            740573, 4,
            107476, 5,
            1353572, 6,
            0, 7
    );

    public static void main(String[] args) {
        int numberOfWorkingHours[] = {8, 10, 9, 10, 8, 12, 14, 9};
        int[] numberOfOvertimeInHours = new int[numberOfWorkingHours.length];
        int numberOfOvertimeInHoursPerDay = 0;
        int overtimePerHours = 0;
        int startingDay = 740573;
        int currentStartDay = daysDictionary.get(startingDay);
        int currentElementIndex;

        for (int i = currentStartDay; i < numberOfOvertimeInHours.length + currentStartDay; i++) {
            currentElementIndex = i - currentStartDay;
            numberOfOvertimeInHoursPerDay = numberOfWorkingHours[currentElementIndex] - 8;

            if ((i % 7 == 6) || (i % 7 == 0)) {
                numberOfOvertimeInHoursPerDay = numberOfWorkingHours[currentElementIndex];
            }

            numberOfOvertimeInHours[currentElementIndex] = numberOfOvertimeInHoursPerDay;
            overtimePerHours += numberOfOvertimeInHoursPerDay;
            System.out.print(numberOfOvertimeInHours[currentElementIndex] + " ");
        }

        System.out.println();
        System.out.printf("Количество переработанных часов: %s", overtimePerHours);
    }
}
