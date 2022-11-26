public class Devil extends Monster {
    private static String name = "魔王";

    public Devil() {
        super.hp = 10;
    }

    public void runAway() {
        System.out.println(Devil.name + "は逃げた");
    }

    public int attack() {
        return new java.util.Random().nextInt(9) + 1;
    }

    public String getName() {
        return Devil.name;
    }
}