public class Goblin extends Monster {
    private static String name = "ゴブリン";

    public Goblin() {
        this.hp = 100;
    }

    @Override
    public void runAway() {
        System.out.println(Goblin.name + "は逃げた");
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(4) + 1;
        return x * 5;
    }

    @Override
    public String getName() {
        return Goblin.name;
    }

}