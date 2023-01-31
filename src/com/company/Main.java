package com.company;

public class Main {

    public static void main(String[] args) {
	Animals catMyrka = new Cat("Myrka");
	catMyrka.run(300);
	catMyrka.swim(2);

	Animals dogRex = new Dog("Rex");
	dogRex.run(600);
	dogRex.swim(8);

	Dog.getInstancesNumber();
	Cat.getInstancesNumber();
	Animals.getInstancesNumber();
    }
}
