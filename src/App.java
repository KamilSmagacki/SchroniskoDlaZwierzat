public class App {
    public static void main(String[] args) {
        AnimalShelter as = new AnimalShelter();
        String[] pets = as.fillPetsTable();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();

        System.out.println("w kojcu nr 33 znajduje się " + pets[33]);
        System.out.println("obecnie w schronisku jest " + as.getNumberOfAnimals(pets, dog, cat, rabbit));

    }
}
