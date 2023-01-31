package com.company;

public class Dog extends Animals {
    private static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
            return;
        }
        System.out.println("Too long distance");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
            return;
        }
        System.out.println("Too long distance");
    }

    public static void getInstancesNumber() {
        System.out.println("Dog was invoked " + counter + " times.");
    }
}
