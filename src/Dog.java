public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Woof woof woof");
    }

    public void jump() {
        System.out.println("Jumping");
    }

    public void run() {
        System.out.println("Running");
    }

    public void bite() {
        System.out.println("Bites");
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
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
