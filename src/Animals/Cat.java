package Animals;

public class Cat extends Animal {
    private static int iloscKotow = 0;

    public Cat() {
        iloscKotow++;
    }

    @Override
    public String getType() {
        return "kot";
    }

    @Override
    public int getInstanceNumber() {
        return iloscKotow;
    }
}
