package com.company;

public class Kosmosas {
    public static void main(String args []){
        int[] array = {1,7,3,10,9};
        double sum = 0;
        double average = 0.0;
        for (int i = 0; i< array.length; i++){

            sum+= array[i];
            average = (double)sum / (i+1);
            System.out.printf("Average is : %.2f\n",average);
        }
    }
}
