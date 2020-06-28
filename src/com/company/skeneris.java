package com.company;
import java.util.Scanner;

public class skeneris {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite atsakymo a tikimybę:");
        int a = reader.nextInt();
        System.out.println("Atsakymo a tikimybė:" + a);

        System.out.println("Įveskite atsakymo b tikimybę:");
        int b = reader.nextInt();
        System.out.println("Atsakymo b tikimybė:" + b);

        System.out.println("Įveskite atsakymo c tikimybę:");
        int c = reader.nextInt();
        System.out.println("Atsakymo c tikimybė:" + c);

        if (a > b) {
            System.out.println("Atsakymas a");
        } else if (a < b) {
            System.out.println("Atsakymas b");
        }
        if (a < c) {
            System.out.println("Atsakymas c");


        }else if(b < c){
            System.out.println("Atsakymas c");
           
        }
    }
}
