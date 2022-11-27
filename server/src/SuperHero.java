public class SuperHero extends Hero {
    public SuperHero(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(4) + 1;
    }

    @Override
    public void talk() {
        System.out.println("スーパー勇者になった。HPは全回復した");
    }
}