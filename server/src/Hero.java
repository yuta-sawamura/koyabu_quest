public class Hero extends Human implements BattleCharacter {

    private int hp;/* 勇者のHP */
    private String name = "";/* 勇者の名前 */

    public Hero(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int attack() {
        return new java.util.Random().nextInt(10);
    }

    public void talk() {
        System.out.println("勇者の名前は" + this.name + "勇者のHP" + this.hp);
    }

    public void runAway() {
        System.out.println("勇者は逃げた");
    }

    public void sleep() {
        this.setHp(100);
        System.out.println("勇者は眠った: 100HP回復した");
    }

    public void setHp(int hp) {
        this.hp += hp;
    }

    public int getHp() {
        return (this.hp);
    }

    public String getName() {
        return (this.name);
    }
}