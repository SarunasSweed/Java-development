package com.company.firstgitproject.StringE;

public class Stringe6 {
    public static void main (String[]args){

        String a = "This is a comparison";
        String b = "THIS is A Comparison";

        int compare = a.compareToIgnoreCase(b);
        System.out.println(compare ==0? "Equal": "Not equal");
    }
}
