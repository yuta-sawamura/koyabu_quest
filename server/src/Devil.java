public class Devil extends Monster {
    private static String name = "魔王";

    public Devil() {
        this.hp = 100;
    }

    @Override
    public void runAway() {
        System.out.println(Devil.name + "は逃げた");
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(9) + 1;
        return x * 5;
    }

    @Override
    public String getName() {
        return Devil.name;
    }
}