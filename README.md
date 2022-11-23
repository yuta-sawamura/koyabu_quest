# koyabu_quest
<<<<<<< HEAD
#aaa11/22
=======

## 環境構築

前提として、[Docker Desktop for Mac](https://docs.docker.jp/docker-for-mac/install.html)がインストールされており、起動していること。

1. `$ docker-compose build` # docker ビルド。最初だけ必要
2. `$ docker-compose up` # docker をフォアグランドで起動
3. `$ docker-compose exec java bash` # コンテナに入る
4. `root@5b7be900c329:/usr/src# javac Main.java` # コンテナ内でコンパイル
5. `root@5b7be900c329:/usr/src# java Main` # Main.class を実行
>>>>>>> e1074d0a8cde2cde89136e7562707ca5642294f5
