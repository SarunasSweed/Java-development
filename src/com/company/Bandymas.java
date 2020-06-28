package com.company;


import java.util.Objects;
import java.util.Scanner;

public class Bandymas {
    public static void main (String args[]){
StringBuilder z = new StringBuilder();
        Scanner reader = new Scanner(System.in);
        System.out.println("Koks tavo vardas?");
        String x = String.valueOf(reader.nextInt());

        String text;
        text = "Eila";
        String atsakymas;
        atsakymas = "Gerai";
        String neigiamas;
        neigiamas = "Blogai";

        if (x == text) {
            System.out.println("Myliu tave :3");

        }

            System.out.println("Labas kaip tau sekasi?");
        String y = String.valueOf(reader.nextInt());

        if (y.equals(atsakymas)){
            System.out.println("Taip ir toliau");

        }
        else if (Objects.equals(y, neigiamas));
        System.out.println("Neliudek");

    }

}

