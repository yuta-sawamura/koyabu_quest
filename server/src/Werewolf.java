public class Werewolf extends Monster {
    private static String name = "狼男";

    public Werewolf() {
        this.hp = 100;
    }

    @Override
    public void runAway() {
        System.out.println(Werewolf.name + "は逃げた");
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(8) + 1;
        return x * 5;
    }

    public String getName() {
        return Werewolf.name;
    }
}
