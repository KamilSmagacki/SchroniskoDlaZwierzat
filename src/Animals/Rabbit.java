package Animals;

import AnimalMethods.AnimalShelter;

public class Rabbit extends Animal {
    public int iloscKrolikow = 0;
    AnimalShelter as = new AnimalShelter();

    @Override
    public String getType() {
        return "krolik";
    }

    @Override
    public void getInstanceNumber() {
        String[] pets = as.getFilledPetsTable();
        for (String animal : pets) {
            if(animal.equals("krolik")) {
                iloscKrolikow++;
            }
        }
        iloscKrolikow++;
    }


}
