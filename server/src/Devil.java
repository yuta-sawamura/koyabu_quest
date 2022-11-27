public class Devil extends Monster {
    private static String name = "魔王";

    public Devil() {
        this.hp = 10;
    }

    @Override
    public void runAway() {
        System.out.println(Devil.name + "は逃げた");
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(9) + 1;
    }

    public String getName() {
        return Devil.name;
    }
}