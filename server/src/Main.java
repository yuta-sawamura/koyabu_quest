import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("勇者の名前を入力して下さい");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Hero hero = new Hero(name);
        String heroName = hero.getName();

        System.out.println("勇者" + heroName + "は最初に王様に会いに行った");
        King king = new King();
        king.talk();

        System.out.println("旅の途中で勇者は敵に出会った");
        int randomNumber = new java.util.Random().nextInt(3);
        Monster enemy;
        if (randomNumber == 0) {
            enemy = new Slime();
        } else if (randomNumber == 1) {
            enemy = new Goblin();
        } else {
            enemy = new Werewolf();
        }
        String enemyName;
        enemyName = enemy.getName();
        System.out.println("敵：" + enemyName + "の登場");

        // ⑤敵に出会った場合、勇者がどう⾏動するかは、プレーヤーが決める。（澤村）
        // ⑥各キャラクターが攻撃を⾏った場合、敵にどの程度のダメージを与えることが出来るかは、乱数できまる。（澤村）
        boolean isLoop = true;
        while (isLoop) {
            System.out.println("数値を入力する。 1:攻撃 2:逃げる");

            int inputNumber = scanner.nextInt();
            if (inputNumber == 1) {
                int damage = hero.attack();
                int enemyHp = enemy.getHp() - damage;
                enemy.setHp(enemyHp);
                if (enemyHp > 0) {
                    System.out.println(heroName + "は" + enemyName + "に攻撃した");
                    System.out.println(damage + "ダメージを与え、残りHPは" + enemyHp);
                } else {
                    System.out.println(heroName + "は" + enemyName + "に攻撃した");
                    System.out.println(enemyName + "は死亡した");
                    isLoop = false;
                }
            } else if (inputNumber == 2) {
                System.out.println("逃げる");
                isLoop = false;
            } else {
                System.err.println("無効な数値です");
                System.exit(0);
            }

            // 敵の攻撃
        }

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