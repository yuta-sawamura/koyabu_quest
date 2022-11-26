public abstract class Monster implements BattleCharacter {
    protected int hp;

    public abstract void runAway();

    public abstract int attack();

    public abstract String getName();

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}