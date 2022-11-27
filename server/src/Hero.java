public class Hero extends Human implements BattleCharacter {

    private int hp = 10;
    private String name = "";

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        return new java.util.Random().nextInt(2) + 1;
    }

    @Override
    public void talk() {
        System.out.println("勇者の名前は" + this.name + "勇者のHP" + this.hp);
    }

    public void runAway() {
        System.out.println(this.getName() + "は逃げた");
    }

    public void sleep() {
        this.setHp(10);
        System.out.println(this.getName() + "は眠った。HPが全回復した");
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return (this.hp);
    }

    public String getName() {
        return (this.name);
    }
}