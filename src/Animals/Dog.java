package Animals;

public class Dog extends Animal {
    private static int iloscPsow = 0;

    public Dog() {
        iloscPsow++;
    }

    @Override
    public String getType() {
        return "pies";
    }

    @Override
    public int getInstanceNumber() {
        return iloscPsow;
    }
}

