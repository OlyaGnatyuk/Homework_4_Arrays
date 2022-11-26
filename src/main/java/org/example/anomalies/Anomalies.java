package org.example.anomalies;

public class Anomalies {
    public static void main(String[] args) {
        int arrayOfAbnormalElements[] = {56, 45, 38, 155, 100, 101};
        Boolean orderAsc = null;
        int lastCheckedNumber = arrayOfAbnormalElements[0];
        System.out.println(lastCheckedNumber);
        boolean wasPrinted;

        for (int i = 1; i < arrayOfAbnormalElements.length; i++) {
            wasPrinted = false;
            if (lastCheckedNumber < arrayOfAbnormalElements[i]) {
                if (orderAsc == null) {
                    orderAsc = true;
                } else if (!orderAsc) {
                    orderAsc = null;
                    printAbnormalElement(arrayOfAbnormalElements[i]);
                    wasPrinted = true;
                }
            }

            if (lastCheckedNumber > arrayOfAbnormalElements[i]) {
                if (orderAsc == null) {
                    orderAsc = false;
                } else if (orderAsc) {
                    orderAsc = null;
                    printAbnormalElement(arrayOfAbnormalElements[i]);
                    wasPrinted = true;
                }
            }

            if (!wasPrinted) {
                System.out.println(arrayOfAbnormalElements[i]);
            }

            lastCheckedNumber = arrayOfAbnormalElements[i];
        }
    }

    public static void printAbnormalElement(int number) {
        System.out.printf("%s <---- аномальный элемент\n", number);
    }

}
