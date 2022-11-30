public class Hero extends Human implements BattleCharacter {

    private int hp = 100;
    private String name = "";

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        int x = new java.util.Random().nextInt(4) + 1;
        return x * 5;
    }
    
   
    
    @Override
    public void talk() {
        System.out.println("勇者の名前は" + this.name + "勇者のHP" + this.hp);
    }

    public void runAway() {
        System.out.println(this.getName() + "は逃げた");
    }

    public void sleep() {
        this.setHp(100);
        System.out.println(this.getName() + "は眠った。HPが全回復した");
    }
    
    public void partner() {
        System.out.println(this.getName() + "は仲間になるように交渉した");
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