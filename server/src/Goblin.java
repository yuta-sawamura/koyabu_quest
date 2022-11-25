public class Goblin implements BattleCharacter {
    private static String name = "ゴブリン";

    public void runAway() {
        System.out.println(Goblin.name + "は逃げた");
    }

    public int attack() {
        return new java.util.Random().nextInt(10);
    }

    public String getName() {
        return Goblin.name;
    }
}