public class Slime extends Monster {
    private static String name = "スライム";

    public Slime() {
        this.hp = 100;
    }

    @Override
    public void runAway() {
        System.out.println(Slime.name + "は逃げた");
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(2) + 1;
        return x * 5;
    }

    @Override
    public String getName() {
        return Slime.name;
    }
}