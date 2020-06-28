package com.company;

public class Cartoon {
    // class access only: encapsulate
    private String name;

    public Cartoon(String mouseName) {
        name = mouseName;
        System.out.println("Calling a mouse: " + this.name);
    }

    // Default constructor: initialize Mouse as object
    public String Mouse() {
        System.out.println("Create a noname mouse:" + name);
        return name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

