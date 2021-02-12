package by.tereshkoMN.bsu.model;

import by.tereshkoMN.bsu.exception.AnimalException;

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal = new Animal("Jake");
            //by.tereshkoMN.bsu.model.Puppy puppy = new by.tereshkoMN.bsu.model.Puppy("Karl","     ");
            Dog dog = new Dog("Boss", "Woof woof woof");
            Dog puppyJ = new Puppy("Jake", "woof woof woof");
            Dog puppyS = new Puppy("Sam", "woof woof woof");

            System.out.println("by.tereshkoMN.bsu.model.Dog name " + puppyJ.getName());
            puppyJ.run();
            puppyJ.jump();
            puppyJ.voice();

            dog.voice();
            puppyJ.bite();

            System.out.println(puppyS.hashCode());
            System.out.println(puppyJ.hashCode());

            System.out.println(dog.equals(animal));
        } catch (AnimalException e) {
            System.err.println(e.getMessage());
        }
    }
}
