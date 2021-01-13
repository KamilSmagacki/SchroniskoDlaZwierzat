package AnimalMethods;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;

public class AnimalShelter {

    RandomAnimal ra = new RandomAnimal();
    public Animal[] pets = new Animal[100];


    public void fillPetsTable() {
        for (int i = 0; i < pets.length; i++) {
            pets[i] = ra.getRandomAnimal();
        }
    }
}
