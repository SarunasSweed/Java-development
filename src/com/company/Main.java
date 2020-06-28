package com.company;

public class Main {

    public static void main(String[] args) {
        for ( int grade = 1; grade <=10; grade++ ) {
            switch (grade) {
                case 10:
                    System.out.println("Super Star!"+ grade);
                    break;
                case 9:
                case 8:
                case 7:
                    System.out.println("Hm, Not bad!"+ grade);
                    break;
                case 6:
                case 5:
                    System.out.println("You passed"+ grade);
                    break;
                case 4:
                    System.out.println("You failed" + grade);
                    break;
                default:
                    System.out.println("Invalid " + grade);
            }
        }
    }
}