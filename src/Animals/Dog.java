package Animals;

import AnimalMethods.AnimalShelter;

public class Dog extends Animal {
    public int iloscPsow = 0;
    AnimalShelter as = new AnimalShelter();

    @Override
    public String getType() {
        return "pies";
    }

    @Override
    public void getInstanceNumber() {
        String[] pets = as.getFilledPetsTable();
        for (String animal : pets) {
            if(animal.equals("pies")) {
                iloscPsow++;
            }
        }
        iloscPsow++;
    }
}
