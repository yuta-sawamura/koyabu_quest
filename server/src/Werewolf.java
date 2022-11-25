public class Werewolf implements BattleCharacter {
    private static String name = "狼男";

    public void runAway() {
        System.out.println(Werewolf.name + "は逃げた");
    }

    public int attack() {
        return new java.util.Random().nextInt(20);
    }

    public String getName() {
        return Werewolf.name;
    }
}