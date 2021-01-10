import java.util.Random;

public class RandomAnimal {
     String getRandomAnimal() {
        Random rd = new Random();
        int wylosownaLiczba = rd.nextInt(3);
        switch (wylosownaLiczba) {
            case 0 -> {
                return new Cat().getType();
            }
            case 1 -> {
                return new Dog().getType();
            }
            case 2 -> {
                return new Rabbit().getType();
            }
            default -> {
                return null;
            }
        }
    }

}
