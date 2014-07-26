開発環境

JDK:1.7.0_65
Tomcat:7.0
PostgreSQL:9.2.8

taglib:1.1.2
ECLIPSE：JUNO（4.2）

プロジェクトをインポートして、Eclipse上でTomcatを設定して立ち上げて、
http://localhost:8080/onsenProject/HelloWorld
にアクセスすれば、立ち上がるはずです、、

ーとりあえずの作業ー
テストとしてSampleを作成
簡単なDBの接続とJSPとの連携を作成しました。

簡単な作りなので、セキュリティとか全然考慮していないです。
ローカルのPOSTGRESQLに
データベース名：onsen
ユーザID：postgres
パスワード：root

スキーマ:summer
テーブル：test_hello（id、titleが要素）

のDBを作成して、テストを作っています。

postgresqlでDBを作成するときには全部小文字で作ってください。
大文字にすると上手くいかないので、気を付けてください。
（postgresは文字の大小を区別するけど、JDBC的には区別しないので、エラーになっているみたいです。
解決方法があれば大文字でもイイかと思いますが、調査する時間がなかったので、そのままにしています。）

