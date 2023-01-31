package com.company;

public class Animals {
    private static int counter;
    private String name;

    public Animals(String name) {
        this.name = name;
        counter++;
    }

    public void run(int distance) {
        System.out.printf("%s ran %dm\n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s swam %dm\n", name, distance);
    }

    public static void getInstancesNumber() {
        System.out.println("Animals was invoked " + counter + " times.");
    }
}
