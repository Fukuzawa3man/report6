package jp.ac.uryukyu.ie.e165711;

/*** ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 * Created by e165711 on 2016/11/26.
 */
public class Hero extends LivingThing {

    /**
     * コンストラクタ.名前,最大HP,攻撃力を指定する.
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void attack(LivingThing opponent) {
        if(isDead() == false) {
            int damage = (int) (Math.random() * getattack());
            int rate = (int) (Math.random() * 1000) / 3;
            if (damage == 0) {
                System.out.printf("%sの攻撃！,,,だが，%sは攻撃を回避した！！\n", getName(), opponent.getName());
            } else {
                if (rate <= 3) {
                    damage = damage * 2;
                    System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                }
                opponent.wounded(damage);
            }

        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド.
     * 指定されたダメージを hitPoint から引き,死亡判定を行う.
     *
     * @param damage 受けたダメージ
     */

    @Override
    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() <= 0) {
            setIsDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n",getName());
        }
    }
}