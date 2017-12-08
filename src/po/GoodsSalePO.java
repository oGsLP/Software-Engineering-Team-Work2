package po;

import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * 封装了一个商品销售的类，包括商品编号和商品
 */
public class GoodsSalePO implements Serializable {
    /**
     * 商品编号
     */
    private int number;

    /**
     * 对应售出的商品
     */
    private int saleNumber;

    public GoodsSalePO() {
    }

    public GoodsSalePO(int number, int saleNumber) {
        this.number = number;
        this.saleNumber = saleNumber;
    }
    @OneToOne
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }
}
