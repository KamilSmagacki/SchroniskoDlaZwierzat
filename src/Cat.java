public class Cat extends Animal {
    int iloscKotow = 0;

    public Cat() {
        numberOfAnimals = getInstanceNumber(iloscKotow);
        getType();
    }

    @Override
    String getType() {
        return name = "kot";

    }

    @Override
    int getInstanceNumber(int iloscKotow) {
        return iloscKotow++;
    }
}
