public class Slime extends Monster {
    private static String name = "スライム";

    public void runAway() {
        System.out.println(Slime.name + "は逃げた");
    }

    public int attack() {
        return new java.util.Random().nextInt(5);
    }

    public String getName() {
        return Slime.name;
    }
}