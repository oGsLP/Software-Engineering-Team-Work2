package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
/**
 * 封装了一个商品销售退货的类，包括商品编号和商品
 */
@Entity(name = "GoodsSaleReturn")
public class GoodsSaleReturnPO implements Serializable {
    /**
     * id
     */
    private int id;

    /**
     * 对应销售退货的商品
     */
    private GoodsPO po;

    /**
     * 对应销售退货的商品数量
     */
    private int saleReturnNumber;

    public GoodsSaleReturnPO() {
    }

    public GoodsSaleReturnPO(int id, GoodsPO po, int saleReturnNumber) {
        this.id = id;
        this.po = po;
        this.saleReturnNumber = saleReturnNumber;
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

    public int getSaleReturnNumber() {
        return saleReturnNumber;
    }

    public void setSaleReturnNumber(int saleReturnNumber) {
        this.saleReturnNumber = saleReturnNumber;
    }
}
