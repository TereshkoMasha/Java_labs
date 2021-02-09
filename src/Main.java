public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Jake");
        Animal animal = new Animal("Jake");
        Dog dog = new Dog("Boss");
        Dog puppy1 = new Puppy("Jake");

        System.out.println("Dog's name " + puppy.getName());
        puppy.run();
        puppy.jump();
        puppy.voice();
        puppy.bite();

        System.out.println(puppy.hashCode());
        System.out.println(puppy1.hashCode());
        System.out.println(dog.equals(animal));
    }
}
