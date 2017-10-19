package GoodsPo;

/**
 * Created by py on 2017/10/18.
 */
import java.util.ArrayList;
public interface GoodsData {
    public boolean add(GoodsPO goods);
    public ArrayList<GoodsPO> exceptionFind ();
    public boolean delete(GoodsPO clas);
    public boolean modify(GoodsPO clas);
    public ArrayList<GoodsPO>find(String number, String name, String type);

}
