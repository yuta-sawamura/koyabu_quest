public class SuperHero extends Hero {
    public SuperHero(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(4) + 1;
    }
}