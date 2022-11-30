import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean isKilledSlime = false, isKilledGoblin = false, isKilledWerewolf = false;

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
            Monster enemy;
            if (Main.isKilledAllEnemies()) {
                enemy = getEnemy(true);
            } else {
                enemy = getEnemy(false);
            }

            String enemyName = enemy.getName();
            System.out.println("敵：" + enemyName + "の登場");

            while (true) {
                System.out.println("数値を入力する。 1:攻撃 2:眠る 3:逃げる 4:仲間にする");

                // 勇者のターン
                try {
                    Scanner sc = new Scanner(System.in);
                    int inputNumber = sc.nextInt();

                    if (inputNumber == 1) {
                        int damage = hero.attack();
                        int enemyHp = enemy.getHp() - damage;
                        enemy.setHp(enemyHp);
                        // 敵を倒した場合
                        if (enemyHp > 0) {
                            System.out.println(
                                    heroName + "は" + enemyName + "に攻撃した。" + damage + "ダメージを与え、残りHPは" + enemyHp);
                        } else {
                            System.out.println(heroName + "は" + enemyName + "に攻撃した");
                            System.out.println(enemyName + "は死亡した");
                            Main.killEnemy(enemy);
                            // スライム、狼男、ゴブリンを全員倒し、スーパー勇者でない場合
                            if (Main.isKilledAllEnemies() && hero instanceof SuperHero == false) {
                                System.out.println("スライム、狼男、ゴブリンを全員倒した");
                                // スーバーヒーローになる
                                hero = new SuperHero(hero.getName());
                                hero.talk();
                            }
                            // 魔王を倒した場合
                            if (enemy instanceof Devil) {
                                isStory = false;
                            }
                            break;
                        }
                    } else if (inputNumber == 2) {
                        hero.sleep();
                    } else if (inputNumber == 3) {
                        hero.runAway();
                        break;
                    } else if (inputNumber == 4) {
                        hero.partner();
                        Main.killEnemy(enemy);
                        System.out.println(heroName + "は" + enemyName + "を仲間にした");
                        if (Main.isKilledAllEnemies() && hero instanceof SuperHero == false) {
                            // スーバーヒーローになる
                            hero = new SuperHero(hero.getName());
                            hero.talk();
                        }
                        // 魔王を倒した場合
                        if (enemy instanceof Devil) {
                            isStory = false;
                        }
                        break;
                    } else {
                        System.err.println("無効な数値です");
                        System.exit(0);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("数値ではありません、数値を入力して下さい");
                }
                // 敵のターン
                int selectedEnemyNumber = new java.util.Random().nextInt(10);
                // 逃げる確率は1/10。1/2の確率で逃げるを選択されるとゲームが全然終わらないため
                if (selectedEnemyNumber == 0) {
                    System.out.println(enemyName + "は逃げた");
                    break;
                } else {
                    int damage = enemy.attack();
                    int heroHp = hero.getHp() - damage;
                    hero.setHp(heroHp);
                    System.out.println(enemyName + "は" + heroName + "に攻撃した。" + damage + "ダメージを与え、残りHPは" + heroHp);
                    // 勇者が倒された場合
                    if (heroHp <= 0) {
                        System.out.println(heroName + "は死亡した。ゲーム終了");
                        System.exit(0);
                    }
                }
            }
        }

        scanner.close();
        Princess princess = new Princess();
        princess.talk();
        System.out.println("===完===");
    }

    // ランダムに敵を取得するメソッド
    // スライム、ゴブリン、狼男を全員倒すと、魔王も出現する可能性がある
    private static Monster getEnemy(boolean isKilledAllEnemies) {
        int randomNumber = new java.util.Random().nextInt(4);
        if (randomNumber == 0) {
            return new Werewolf();
        } else if (randomNumber == 1) {
            return new Goblin();
        } else if (randomNumber == 2) {
            return new Slime();
        } else {
            if (isKilledAllEnemies == true) {
                return new Devil();
            } else {
                return new Slime();
            }
        }
    }

    // 敵を倒すと該当の敵フラグをtrueにするメソッド
    private static void killEnemy(Monster enemy) {
        if (enemy instanceof Slime) {
            isKilledSlime = true;
            return;
        }

        if (enemy instanceof Goblin) {
            isKilledGoblin = true;
            return;
        }

        if (enemy instanceof Werewolf) {
            isKilledWerewolf = true;
            return;
        }
    }

    // スライム、ゴブリン、狼男を全員倒したか判定するメソッド
    private static boolean isKilledAllEnemies() {
        return isKilledSlime == true && isKilledGoblin == true && isKilledWerewolf == true;
    }
}