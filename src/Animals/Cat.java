package Animals;

import AnimalMethods.AnimalShelter;

public class Cat extends Animal {
    public int iloscKotow = 0;
    AnimalShelter as = new AnimalShelter();

    @Override
    public String getType() {
        return "kot";
    }

    @Override
    public void getInstanceNumber() {
        String[] pets = as.getFilledPetsTable();
        for (String animal : pets) {
            if(animal.equals("kot")) {
                iloscKotow++;
            }
        }
        iloscKotow++;
    }
}
