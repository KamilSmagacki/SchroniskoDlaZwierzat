import AnimalMethods.AnimalShelter;

public class App {
    public static void main(String[] args) {
        AnimalShelter as = new AnimalShelter();
        as.fillPetsTable();

        System.out.println(":=======================================:");
        System.out.println(":              Schronisko               :");
        System.out.println(":=======================================:");
        System.out.println(": w kojcu nr 33 znajduje się " + as.pets[33 - 1].getType() + "\t\t:");
        System.out.println(": (obecnie w schronisku jest ich " + as.pets[33 - 1].getInstanceNumber() + ")    :");
        System.out.println(":=======================================:");

    }
}
