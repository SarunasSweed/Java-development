package com.company.firstgitproject.StringE;

public class Stringe3 {
    public static void main(String[]args){

        StringBuilder x = new StringBuilder();

        String text = "Programmer";
        x.append(text);

        System.out.println(x.substring(0, x.length()/2));

    }
}
