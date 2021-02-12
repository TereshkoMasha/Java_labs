package by.tereshkoMN.bsu.model;

import by.tereshkoMN.bsu.exception.AnimalException;
import by.tereshkoMN.bsu.exception.DogException;

import java.util.Objects;

public class Dog extends Animal {
    private final String voice;

    public Dog(String name, String voice) throws AnimalException {
        super(name);
        if (voice.isBlank()) throw new DogException("The dog " + this.getName() + " has no voice to bark");
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void voice() {
        System.out.println(this.voice.toUpperCase());
    }

    public void jump() {
        System.out.println("by.tereshkoMN.bsu.model.Dog " + this.getName() + " jumping");
    }

    public void run() {
        System.out.println("by.tereshkoMN.bsu.model.Dog " + this.getName() + " running");
    }

    public void bite() {
        System.out.println("The dog " + this.getName() + " wants to bite you");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(voice, dog.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), voice);
    }

    @Override
    public String toString() {
        return "by.tereshkoMN.bsu.model.Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
