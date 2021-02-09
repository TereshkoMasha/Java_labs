public class Puppy extends Dog{

    public Puppy(String name) {
        super(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
