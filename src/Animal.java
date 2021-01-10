public abstract class Animal {
    String name = getType();
    int numberOfAnimals = 0;

    abstract String getType();

    abstract int getInstanceNumber(int x);
}
