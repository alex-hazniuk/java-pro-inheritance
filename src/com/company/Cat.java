package com.company;

public class Cat extends Animals {
    private static int counter;

    public Cat(String name) {
        super(name);
        counter++;

    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.printf("%s ran %dm\n", getName(), distance);
            return;
        }
        System.out.println("Unreachable distance. Change parameter!");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat does`t swim");
    }

    public static void getInstancesNumber() {
        System.out.println("Cat was invoked " + counter + " times.");
    }
}
