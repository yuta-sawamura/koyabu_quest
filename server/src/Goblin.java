public class Goblin extends Monster {
    private static String name = "ゴブリン";

    public Goblin() {
        this.hp = 10;
    }

    @Override
    public void runAway() {
        System.out.println(Goblin.name + "は逃げた");
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(2) + 1;
    }

    @Override
    public String getName() {
        return Goblin.name;
    }

}