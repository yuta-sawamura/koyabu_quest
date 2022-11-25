public abstract class Monster implements BattleCharacter {
    int hp = 100;

    public abstract void runAway();

    public abstract int attack();

    public abstract String getName();
}