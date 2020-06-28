package com.company;

public class ThirdDayExcercises {

    public static void main(String args[]) {
        int[] array = {1, 3, 7, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d elementas bus %d\n", i, array[i]);
            sum += array[i];
        }

        System.out.printf("Masyvo elementu suma bus %d\n", sum);
    }
}