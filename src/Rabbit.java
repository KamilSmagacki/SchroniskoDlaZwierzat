public class Rabbit extends Animal {
    int iloscKrolikow = 0;

    public Rabbit() {
        numberOfAnimals = getInstanceNumber(iloscKrolikow);
        getType();
    }

    @Override
    String getType() {
        return name = "krolik";
    }

    @Override
    int getInstanceNumber(int iloscKrolikow) {
        return iloscKrolikow++;
    }


}
