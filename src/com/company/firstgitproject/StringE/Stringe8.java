package com.company.firstgitproject.StringE;

public class Stringe8 {
    public static void main (String args[]){

        String text = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";

        char[] ch = text.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i=0; i< text.length(); i++){
            if( Character.isLetter(ch[i])){
                letter ++;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++;
            }
            else {
                other ++;
            }

        }
        System.out.println("The string is : Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("number: " +num);
        System.out.println("space: " +space);
        System.out.println("other: " +other);
    }
}
