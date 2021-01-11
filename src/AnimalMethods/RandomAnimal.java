package AnimalMethods;

import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;

import java.util.Random;

public class RandomAnimal {
    int wylosownaLiczba;

    Random rd = new Random();

     String getRandomAnimal() {
        wylosownaLiczba = rd.nextInt(3);
        switch (wylosownaLiczba) {
            case 0 -> {
                return new Cat().getType();
            }
            case 1 -> {
                return new Dog().getType();
            }
            case 2 -> {
                return new Rabbit().getType();
            }
            default -> {
                return "";
            }
        }
    }

}
