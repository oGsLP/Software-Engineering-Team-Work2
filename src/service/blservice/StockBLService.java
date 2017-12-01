package service.blservice;

import objects.ResultMessage;
import vo.StockVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface StockBLService {
    public ResultMessage createReceipt(StockVO vo);
    public ResultMessage cancelReceipt(StockVO vo);
    public ResultMessage finshReceipt(StockVO vo);
    public ArrayList<StockVO> getReceipt(StockVO vo);
    public ResultMessage changeMoney(StockVO vo);

}
