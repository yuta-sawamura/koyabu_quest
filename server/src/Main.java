import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("勇者の名前を入力して下さい");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Hero hero = new Hero(100, name);
        String heroName = hero.getName();

        System.out.println("勇者" + heroName + "は最初に王様に会いに行った");
        King king = new King();
        king.talk();

        System.out.println("旅の途中で勇者は敵に出会った");
        int randomNumber = new java.util.Random().nextInt(3);
        if (randomNumber == 0) {
            Slime enemy = new Slime();
            System.out.println("敵：" + enemy.getName() + "の登場");
        } else if (randomNumber == 1) {
            Goblin enemy = new Goblin();
            System.out.println("敵：" + enemy.getName() + "の登場");
        } else {
            Werewolf enemy = new Werewolf();
            System.out.println("敵：" + enemy.getName() + "の登場");
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

        /*
         * Princess princess = new Princess();
         * princess.talk();
         */
        scanner.close();
        System.out.println("使命を完了した");
    }
}