package by.tereshkoMN.bsu.model;

import by.tereshkoMN.bsu.exception.AnimalException;

public class Puppy extends Dog {

    public Puppy(String name, String voice) throws AnimalException {
        super(name, voice);
    }

    @Override
    public void voice() {
        System.out.println(this.getVoice().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "by.tereshkoMN.bsu.model.Puppy{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
