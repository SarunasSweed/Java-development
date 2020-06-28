package com.company.firstgitproject.DataE;


import java.time.Clock;
import java.time.Instant;
import java.util.Scanner;

public class Datae2 {
    public static void main(String[] args) {

       int x = 133;
       int digit1;
       int digit2;
       int digit3;

       digit1 = x / 100;
       digit2 = x % 100 / 10;
       digit3 = x % 100 % 10;

       int sum = digit1+digit2+digit3;

       System.out.printf("All digits of number %d is:\n%d\n%d\n%d\n And the sum is: %d ",x , digit1, digit2, digit3, sum);
    }
}