package businesslogicservice;

import vo.SaleVO;
import java.util.ArrayList;
/**
 * Created by py on 2017/10/20.
 */
public interface SaleBLService {
    public ResultMessage createReceipt(SaleVO vo);
    public ResultMessage cancelReceipt(SaleVO vo);
    public ResultMessage finshRecceipt(SaleVO vo);
    public ArrayList<SaleVO> getReceipt(SaleVO vo);
    public ResultMessage changeMoney(SaleVO vo);
}
