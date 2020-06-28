package com.company.firstgitproject;

import java.util.Scanner;

public class NIce {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        String myString1 =  new String ("Name");
        String myString2 =  new String ("feeling");


        System.out.println ("What is your name?");
        myString1=input.next();
        System.out.println("Hello" + (" ") + myString1 + (" ") + "how are you?");
        myString2=input.next();

        if (myString2.contains("Good")){
            System.out.println("Keep it up" + (" ") + myString1 + "!");
        }
        else if (myString2.contains("Bad")){
            System.out.println("Hang in there" + (" ") +  myString1 + "!");
        }
    }
}
