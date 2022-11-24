public class Hero extends Human implements BattleCharacter {
    /*Human から　フィールドを継承している
    Humanから継承した抽象メソッド　talk（）　を実装*/
    private int hp;/*勇者のｈｐ*/
    private String name ="";/*勇者の名前*/

    public Hero(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }
    
    /*BattleCharacter から継承した抽象メソッドを実装　attack()*/
       public int attack() {
        return 1;
        }
    
        public void talk() {
            System.out.println("勇者の名前は" + this.name + "勇者のHP" + this.hp);
        }
    /*    
        public void runAway() {
        }
        
        public void sleep() {
        }
    */    
    
    /*name のsetter Method*/
    public void setName(String name) {
        this.name = name;
    }
/*ＨＰのsetter Method */
    public void setHp() {
    }
/*HPのgetter Method*/
    public int getHp() {
        return 1;
    }
/*name のgetter Method*/
    public String getName() {
        return(this.name);
    }
}