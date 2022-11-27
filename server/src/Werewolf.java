public class Werewolf extends Monster {
    private static String name = "狼男";

    public Werewolf() {
        this.hp = 10;
    }

    @Override
    public void runAway() {
        System.out.println(Werewolf.name + "は逃げた");
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(4) + 1;
    }

    public String getName() {
        return Werewolf.name;
    }
}
