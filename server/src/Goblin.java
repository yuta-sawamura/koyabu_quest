public class Goblin extends Monster {
    private static String name = "ゴブリン";

    public Goblin() {
        super.hp = 10;
    }

    public void runAway() {
        System.out.println(Goblin.name + "は逃げた");
    }

    public int attack() {
        return new java.util.Random().nextInt(2) + 1;
    }

    public String getName() {
        return Goblin.name;
    }

}