public class Main {
     public static void main(String[] args) {

        // ①勇者は、誕⽣したらプレーヤーから名前を与えられる。（くろだい）
        // heroインスタンスにHPと名前をセット
        System.out.println("勇者の名前を入力して下さい");
        String name = new java.util.Scanner(System.in).nextLine();
        /*勇者のHPを１００で設定*/
        Hero hero = new Hero(100, name);
        hero.setName(name);
        hero.setHp();
        
        name = hero.getName();
        int hp = hero.getHp();
        
        // ②勇者は、最初に、王様に会いに⾏き、使命を与えられる。（くろだい）
        // kingのコンストラクタでprintlnするだけ
        // King king = new King();
        System.out.println("勇者" + name + "は最初に王様に会いに行った");
        King king = new King();
        king.talk();
        
        // ④旅の途中で、敵に出会う。（くろだい）
        // ランダムで敵クラスをnewする
        System.out.println("旅の途中で勇者は敵に出会った");
        //多態性を使うためのクラスの配列を作成　課題の練習17を参照
        BattleCharacter[] ch = new BattleCharacter[3]; 
        ch[0] = new Slime();
        ch[1] = new Goblin();
        ch[2] = new WolfMan();
        //定義したクラスの配列　を乱数で決める
            int r = new java.util.Random().nextInt(3);
           if(r == 0){
               System.out.println("敵：スライムの登場");
               ch[0].getHp();
           } else if (r == 1){
               System.out.println("敵：ゴブリンの登場");
               ch[1].getHp();
           } else {
               System.out.println("敵：狼男の登場");
               ch[2].getHp();
           }
        // ⑤敵に出会った場合、勇者がどう⾏動するかは、プレーヤーが決める。（澤村）

        // ⑥各キャラクターが攻撃を⾏った場合、敵にどの程度のダメージを与えることが出来るかは、乱数できまる。（澤村）

        // ⑦旅の途中で、魔法使いに出会う。（澤村）

        // ⑧スライム、ゴブリン、狼男を全て倒し、魔法使いと仲間になると、勇者は、スーパー勇者になる。（澤村）

        // ⑨スーパー勇者になったあと、再び旅に出る。（澤村）

        // ⑩旅の途中で、敵に出会う。（澤村）

        // ⑪魔王と戦って、勝つことが出来れば、お姫様を救うことが出来る。（澤村）

        // ⑫お姫様から、感謝の⾔葉をもらい、使命は完了して、ゲームは終了する。（くろだい）
        // printlnしてexit
        
        /*Princess princess = new Princess();
        princess.talk();*/
        System.out.println("使命を完了した　Exit");
    }
}