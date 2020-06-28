package com.company.firstgitproject.Cuckei;

public class TestDog {
    public static void main(String[]args){

        Dog avukas = new Dog("kiemsikys" , "Female" );
        System.out.println(avukas);


        try {
            avukas.setWeight(3.18);
            System.out.println(avukas);
        } catch (Throwable e) {
            System.err.println("Dog has negative weight" + e.getMessage());
        }
        System.out.println("Viskas ok");
    }
}
