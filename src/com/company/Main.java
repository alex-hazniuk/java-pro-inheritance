package com.company;

public class Main {

    public static void main(String[] args) {
        Animals catMyrka = new Cat("Myrka");
        catMyrka.run(0);
        catMyrka.swim(5);

        Animals dogRex = new Dog("Rex");
        dogRex.run(600);
        dogRex.swim(8);

        Cat catStepan = new Cat("Stepan");

        Dog.getInstancesNumber();
        Cat.getInstancesNumber();
        Animals.getInstancesNumber();
    }
}
