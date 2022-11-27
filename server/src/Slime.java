public class Slime extends Monster {
    private static String name = "スライム";

    public Slime() {
        super.hp = 10;
    }

    @Override
    public void runAway() {
        System.out.println(Slime.name + "は逃げた");
    }

    @Override
    public int attack() {
        return 1;
    }

    public String getName() {
        return Slime.name;
    }
}