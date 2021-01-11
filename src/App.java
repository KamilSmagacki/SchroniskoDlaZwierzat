import AnimalMethods.AnimalShelter;

public class App {
    public static void main(String[] args) {
        AnimalShelter as = new AnimalShelter();
        String[] pets = as.getFilledPetsTable();

        System.out.println(":=======================================:");
        System.out.println(":              Schronisko               :");
        System.out.println(":=======================================:");
        System.out.println(": w kojcu nr 33 znajduje się " + pets[33] + "\t\t:");
        System.out.println(": (obecnie w schronisku jest ich " + as.getNumberOfAnimals() + ")" + "    :");
        System.out.println(":=======================================:");

    }
}
