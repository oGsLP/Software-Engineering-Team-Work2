package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by py on 2017/10/19.
 * 商品分类的类
 */
@Entity(name = "Classify")
public class ClassifyPO implements Serializable {

    /**
     * 分类名称
     */
    public String name;

    /**
     * 分类下的商品
     */

    public Set<GoodsPO> goodsSet = new HashSet<GoodsPO>();

    public ClassifyPO() {
    }

    public ClassifyPO(String name, Set<GoodsPO> goodsSet) {
        this.name = name;
        this.goodsSet = goodsSet;
    }
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany

    public Set<GoodsPO> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<GoodsPO> goodsSet) {
        this.goodsSet = goodsSet;
    }
}