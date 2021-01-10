public class AnimalShelter {
     AnimalShelter() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();
        getNumberOfAnimals(fillPetsTable(), dog, cat, rabbit);
    }

    String[] fillPetsTable() {
        RandomAnimal ra = new RandomAnimal();
        String[] pets = new String[100];

        for (int i = 0; i < pets.length; i++) {
            pets[i] = ra.getRandomAnimal();
        }
        return pets;
    }

    int getNumberOfAnimals(String[] pets, Dog dog, Cat cat, Rabbit rabbit) {
        if(pets[33].equals("pies")) {
           return dog.numberOfAnimals;
        }
        else if (pets[33].equals("kot")) {
            return cat.numberOfAnimals;
        }
        else if (pets[33].equals("krolik")) {
            return rabbit.numberOfAnimals;
        }
        else {
            return 0;
        }
    }
}
