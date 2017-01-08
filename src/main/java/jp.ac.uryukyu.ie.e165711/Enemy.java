/**
 *  敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 * Created by e165711 on 2016/11/26.
 */
public class Enemy extends LivingThing {
    private boolean dead;

    /**
     * コンストラクタ.名前,最大HP,攻撃力を指定する.
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

}