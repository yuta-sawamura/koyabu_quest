public class SuperHero extends Hero {
    public SuperHero(String name) {
        super(name);
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(8) + 1;
        return x * 5;
    }

    @Override
    public void talk() {
        System.out.println("スーパー勇者になった。HPは全回復した");
    }
}