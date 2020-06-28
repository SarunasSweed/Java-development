package com.company.firstgitproject.Cuckei;

import java.util.Random;

public class Dog {




    private String name;
    private Byte age;
    private String breed;
    private Double weight;
    private Boolean gender;
    static Random r = new Random();


    private Dog() {
        System.out.println("Setting default values");

        this.name = "Dog" + r.nextInt(100);
        this.age = 1;
        this.weight = 0.1;
    }

    public Dog(String name, boolean gender, byte age, String breed, double weight) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

        System.out.println("Creating a dog with name" + this.name);

    }

    public Dog(String breed, String gender) {
        this();
        this.breed = breed;
        this.gender = gender.equalsIgnoreCase("female");

    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append(this.getName()).
                append(" ").
                append(this.getGender()).
                append(" ").
                append(getBreed()).
                append(" ").
                append(this.getAge()).
                append(" ").
                append(String.format("%.2f", kgToPound(getWeight()))).
                append("\n");


        return x.toString();
    }
    public static Double kgToPound(double weight){

        return weight * 2.2046;
    }
    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Double getWeight() {
        return weight;
    }

    public String getGender() {
        return this.gender ? "female" : "male";
    }

        public void setName (String name){
            this.name = name;
        }

        public void setAge (Byte age){
            this.age = age;
        }

        public void setBreed (String breed){
            this.breed = breed;
        }

        public void setWeight (Double weight) throws AssertionError {

            if (weight <= 0)
                throw new AssertionError("Weight cannot be zero ");
            this.weight = weight;
        }

            public void setGender (Boolean gender){
               this.gender = gender;
            }
            public static void setR(Random r){
        Dog.r = r;

        }
    }

