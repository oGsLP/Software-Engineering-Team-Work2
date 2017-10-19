package businesslogicservice;

/**
 * Created by py on 2017/10/19.
 */
import vo.GoodsVO;
import java.util.ArrayList;
public interface GoodsBLService {
    public ResultMessage addGoods(GoodsVO vo);
    public ResultMessage deleteGoods(GoodsVO vo);
    public ResultMessage modifyGoods(GoodsVO vo);
    public ArrayList<GoodsVO> findGoods(String keywords);
    public ArrayList<GoodsVO> getGoods(String node);


}
