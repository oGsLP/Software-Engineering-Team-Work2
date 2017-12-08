package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
/**
 * 封装了一个商品进货的类，包括商品编号和商品
 */
@Entity(name = "GoodsStock")
public class GoodsStockPO implements Serializable{
    /**
     * id
     */
    public int id;
    /**
     * 对应进货的商品
     */
    public GoodsPO po;

    /**
     * 对应进货的商品数量
     */

    public int stockNumber;

    public GoodsStockPO() {
    }

    public GoodsStockPO(int id, GoodsPO po, int stockNumber) {
        this.id = id;
        this.po = po;
        this.stockNumber = stockNumber;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne
    public GoodsPO getPo() {
        return po;
    }

    public void setPo(GoodsPO po) {
        this.po = po;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }
}
