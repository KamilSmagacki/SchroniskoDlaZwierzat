public class Dog extends Animal {
    int iloscPsow = 0;

    public Dog() {
        numberOfAnimals = getInstanceNumber(iloscPsow);
        getType();
    }

    @Override
    String getType() {
        return name = "pies";
    }

    @Override
    int getInstanceNumber(int iloscPsow) {
        return iloscPsow++;
    }
}
