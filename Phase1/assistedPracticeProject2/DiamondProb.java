package assistedPracticeProject2;

interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound");
    }
}
interface Tiger extends Animal {
    default void sound() {
        System.out.println("Tiger Roars");
    }
}
interface Lion extends Animal {
    default void sound() {
        System.out.println("Lion Roars");
    }
}
class Liger implements Tiger, Lion {
    @Override
    public void sound() {
        System.out.println("Liger makes a sound");
    }
}
public class DiamondProb {
    public static void main(String[] args) {
        Liger mix = new Liger();
        mix.sound();
    }
}