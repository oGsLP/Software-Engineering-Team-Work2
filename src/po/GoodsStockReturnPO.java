package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
/**
 * 封装了一个商品进货退货的类，包括商品编号和商品
 */
@Entity(name = "GoodsStockReturn")
public class GoodsStockReturnPO implements Serializable {
    /**
     * id
     */
    public int id;


    /**
     * 对应进货退货的商品
     */
    public GoodsPO po;

    /**
     * 对应进货退货的商品数量
     */
    public int stockReturnNumber;

    public GoodsStockReturnPO() {
    }

    public GoodsStockReturnPO(int id, GoodsPO po, int stockReturnNumber) {
        this.id = id;
        this.po = po;
        this.stockReturnNumber = stockReturnNumber;
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

    public int getStockReturnNumber() {
        return stockReturnNumber;
    }

    public void setStockReturnNumber(int stockReturnNumber) {
        this.stockReturnNumber = stockReturnNumber;
    }
}
