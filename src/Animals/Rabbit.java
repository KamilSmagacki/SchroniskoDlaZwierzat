package Animals;

public class Rabbit extends Animal {
    private static int iloscKrolikow = 0;

    public Rabbit() {
        iloscKrolikow++;
    }

    @Override
    public String getType() {
        return "krolik";
    }

    @Override
    public int getInstanceNumber() {
        return iloscKrolikow;
    }
}

