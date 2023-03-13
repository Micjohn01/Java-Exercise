package chapter16.list.optional;

import chapter10.Animal;

import java.util.Optional;

public class ExampleOne {
    public static void main(String[] args) {
        Optional<Animal> foundAnimal = getAnimal();
        Animal animal = foundAnimal.get();
        animal.speak();

    }

    private static Optional<Animal> getAnimal(){
        Animal animal = new Animal();
        return Optional.of(animal);
    }
}
