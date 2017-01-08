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

}