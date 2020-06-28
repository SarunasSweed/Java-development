package com.company;

import java.util.Scanner;

public class Duke {

    public static void main (String [] args) {


        Scanner klav = new Scanner(System.in);

        int skaicius;
        System.out.println("Iveskite sveikaji skaiciu");
        skaicius = klav.nextInt();

        if (skaicius %15 == 0){
            System.out.println("Fizzbuzz");
        }
        if (skaicius %15 != 0 && skaicius % 3==0){
            System.out.println(("fizz"));
        }
        if (skaicius %15 != 0 && skaicius % 5==0){
            System.out.println("buzz");
        }
        if(skaicius % 3 !=0 && skaicius % 5 !=0){
            System.out.println("Ivedete ne fizzbuzzini skaiciu");
        }



    }
}
