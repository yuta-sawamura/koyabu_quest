import java.util.Scanner;

public class Main {
    private static boolean isBeatSlime = false, isBeatGoblin = false, isBeatWerewolf = false,
            becameSuperHero = false;

    public static void main(String[] args) {
        System.out.println("勇者の名前を入力して下さい");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Hero hero = new Hero(name);
        String heroName = hero.getName();

        System.out.println("勇者" + heroName + "は最初に王様に会いに行った");
        King king = new King();
        king.talk();

        boolean isStory = true;
        while (isStory) {
            System.out.println("旅の途中で勇者は敵に出会った");
            Monster enemy = getEnemy();
            String enemyName = enemy.getName();
            System.out.println("敵：" + enemyName + "の登場");

            if (Main.isBeatAllEnemies() && !(hero instanceof SuperHero)) {
                hero = new SuperHero(hero.getName());
            }

            while (true) {
                System.out.println("数値を入力する。 1:攻撃 2:眠る 3:逃げる");

                // 勇者のターン
                int inputNumber = scanner.nextInt();
                if (inputNumber == 1) {
                    int damage = hero.attack();
                    int enemyHp = enemy.getHp() - damage;
                    enemy.setHp(enemyHp);
                    if (enemyHp > 0) {
                        System.out.println(
                                heroName + "は" + enemyName + "に攻撃した。" + damage + "ダメージを与え、残りHPは" + enemyHp);
                    } else {
                        System.out.println(heroName + "は" + enemyName + "に攻撃した");
                        System.out.println(enemyName + "は死亡した");
                        Main.beatEnemy(enemy);
                        break;
                    }
                } else if (inputNumber == 2) {
                    hero.sleep();
                } else if (inputNumber == 3) {
                    hero.runAway();
                    break;
                } else {
                    System.err.println("無効な数値です");
                    System.exit(0);
                }

                // 敵のターン
                int selectedEnemynumber = new java.util.Random().nextInt(2);
                if (selectedEnemynumber == 1) {
                    int damage = enemy.attack();
                    int heroHp = hero.getHp() - damage;
                    hero.setHp(heroHp);
                    System.out.println(enemyName + "は" + heroName + "に攻撃した。" + damage + "ダメージを与え、残りHPは" + heroHp);
                    if (heroHp <= 0) {
                        System.out.println(heroName + "は死亡した。ゲーム終了");
                        System.exit(0);
                    }
                } else {
                    System.out.println(enemyName + "は逃げた");
                    Main.beatEnemy(enemy);
                    break;
                }
            }

            // ⑧スライム、ゴブリン、狼男を全て倒し、魔法使いと仲間になると、勇者は、スーパー勇者になる。（澤村）
            // SuperHero superHero;
            // if (Main.isAbleToSuperHero()) {
            // superHero = new SuperHero(hero.getName());
            // becameSuperHero = true;
            // System.out.println(heroName + "スーパー勇者になった");
            // }

            // ⑨スーパー勇者になったあと、再び旅に出る。（澤村）
            // ⑩旅の途中で、敵に出会う。（澤村）

            // ⑪魔王と戦って、勝つことが出来れば、お姫様を救うことが出来る。（澤村）
        }

        // ⑫お姫様から、感謝の⾔葉をもらい、使命は完了して、ゲームは終了する。（くろだい）
        // printlnしてexit

        scanner.close();
        System.out.println("使命を完了した");
    }

    private static Monster getEnemy() {
        int randomNumber = new java.util.Random().nextInt(4);
        if (becameSuperHero == true) {
            if (randomNumber == 3) {
                return new Devil();
            }
        }

        if (randomNumber == 0) {
            return new Werewolf();
        } else if (randomNumber == 1) {
            return new Goblin();
        } else {
            return new Slime();
        }
    }

    private static void beatEnemy(Monster enemy) {
        if (enemy instanceof Slime) {
            isBeatSlime = true;
            return;
        }

        if (enemy instanceof Goblin) {
            isBeatGoblin = true;
            return;
        }

        if (enemy instanceof Werewolf) {
            isBeatWerewolf = true;
            return;
        }
    }

    private static boolean isBeatAllEnemies() {
        return isBeatSlime == true && isBeatGoblin == true && isBeatWerewolf == true;
    }
}