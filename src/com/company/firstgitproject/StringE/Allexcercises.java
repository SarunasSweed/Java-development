package com.company.firstgitproject.StringE;

public class Allexcercises {
    public static void main (String [] args){

        String changeCase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(changeCase);

        String result;
        result = changeCase.toLowerCase();
        System.out.println(result);
    }

    {
        StringBuilder x = new StringBuilder();
        String text = "Java";
        x.append(text);
        x.reverse();
        System.out.println(x);
    }
}
