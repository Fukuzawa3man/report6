/**
 *  敵クラス．
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態．true=死亡．
 * Created by e165711 on 2016/11/26.
 */

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ．名前,最大HP,攻撃力を指定する.
     *
     * @param name      勇者orモンスター名
     * @param maximumHP 勇者orモンスターのHP
     * @param attack    勇者orモンスターの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        if (name == "ヨシヒコ") {
            System.out.printf("勇者%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
        } else {
            System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
        }

    }



    /**
     * getterメソッドと同等.生死をboolean表現しているためメソッド名をisDead()とした.
     * @return boolean
     */
    public boolean isDead() {
        return this.dead;
    }

    public void setIsDead(boolean dead) {
        this.dead = dead;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * Heroへ攻撃するメソッド.
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行.
     *
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド.
     * 指定されたダメージを hitPoint から引き,死亡判定を行う.
     *
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            if (name == "ヨシヒコ") {
                System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
            } else {
                System.out.printf("モンスター%sは倒れた。\n", name);

            }
        }
    }

}