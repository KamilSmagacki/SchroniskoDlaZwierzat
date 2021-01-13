package AnimalMethods;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;

import java.util.Random;

public class RandomAnimal extends Random {
    int wylosownaLiczba;

    Animal getRandomAnimal() {
        wylosownaLiczba = nextInt(3);
        switch (wylosownaLiczba) {
            case 0 -> {
                return new Cat();
            }
            case 1 -> {
                return new Dog();
            }
            case 2 -> {
                return new Rabbit();
            }
            default -> {
                return null;
            }
        }
    }

}
