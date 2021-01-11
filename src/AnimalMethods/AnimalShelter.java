package AnimalMethods;

import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;

public class AnimalShelter {

    RandomAnimal ra = new RandomAnimal();
    String[] pets = new String[100];


    String[] fillPetsTable() {
        for (int i = 0; i < pets.length; i++) {
            pets[i] = ra.getRandomAnimal();
            pets[i] = pets[i];
        }
        return pets;
    }

    public String[] getFilledPetsTable() {
        return fillPetsTable();
    }

    public int getNumberOfAnimals() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();

        switch (pets[33]) {
            case "pies":
                dog.getInstanceNumber();
                return dog.iloscPsow;
            case "kot":
                cat.getInstanceNumber();
                return cat.iloscKotow;
            case "krolik":
                rabbit.getInstanceNumber();
                return rabbit.iloscKrolikow;
            default:
                return 0;
        }
    }
}
