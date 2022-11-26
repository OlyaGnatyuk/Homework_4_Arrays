package org.example.working_week_unfinished;

public class WorkingWeekUnfinished {
    private static final int DAYS_NUMBER = 7;

    public static void main(String[] args) {
        int numbersOfWorkingPeoplePerDay[] = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0, 5, 5};
        int[] numbersOfWorkingPeoplePerWeek = new int[numbersOfWorkingPeoplePerDay.length/ DAYS_NUMBER + 1];
        int sumOfDays = 0;
        int counterOfDays = 0;
        int leftBorder = 0;
        int rightBorder = 7;
        int counterOfWeeks = 0;

        while (counterOfDays < numbersOfWorkingPeoplePerDay.length) {
            for (counterOfDays = leftBorder; counterOfDays < rightBorder; counterOfDays++) {
                sumOfDays += numbersOfWorkingPeoplePerDay[counterOfDays];
            }
            numbersOfWorkingPeoplePerWeek[counterOfWeeks] = sumOfDays;
            System.out.print(numbersOfWorkingPeoplePerWeek[counterOfWeeks] + " ");
            leftBorder += DAYS_NUMBER;
            rightBorder += DAYS_NUMBER;

            if (rightBorder > numbersOfWorkingPeoplePerDay.length) {
                rightBorder = rightBorder - DAYS_NUMBER + numbersOfWorkingPeoplePerDay.length % DAYS_NUMBER;
            }

            sumOfDays = 0;
            counterOfWeeks++;
        }
    }
}
