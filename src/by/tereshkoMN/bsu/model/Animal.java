package by.tereshkoMN.bsu.model;

import by.tereshkoMN.bsu.exception.AnimalException;

import java.util.Objects;

public class Animal {
    private final String name;

    public Animal(String name) throws AnimalException {
        if(name.isBlank()) throw  new AnimalException("Invalid name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "by.tereshkoMN.bsu.model.Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
