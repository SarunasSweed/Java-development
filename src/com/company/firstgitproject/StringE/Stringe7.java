package com.company.firstgitproject.StringE;

public class Stringe7 {
    public static void main(String[]args){

        String text = "Java excercises";
        String endsWith = "ses";

        if (text.substring(text.length()-endsWith.length()).equals(endsWith)){
            System.out.printf("%s neds with %s\n" ,text, endsWith);
        }


    }
}
