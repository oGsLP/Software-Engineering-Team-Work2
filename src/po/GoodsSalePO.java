package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * 封装了一个商品销售的类，包括商品编号和商品
 */
@Entity(name = "GoodsSale")

public class GoodsSalePO implements Serializable {
    /**
     * id
     */
    public int id;


    /**
     * 对应售出的商品
     */
    public GoodsPO po;

    /**
     * 对应售出的商品数量
     */
    private int saleNumber;

    public GoodsSalePO() {
    }

    public GoodsSalePO(int id, GoodsPO po, int saleNumber) {
        this.id = id;
        this.po = po;
        this.saleNumber = saleNumber;
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

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

   //public static void main(String[] args){
   //     int number = 10;
     //   GoodsPO po = new GoodsPO(1, "长管台灯", "Lamp-LP",
       //         200, 15, 100, 18, 200);
        //HQLTools.add(new GoodsSalePO(1, po, number));

    //}
}
