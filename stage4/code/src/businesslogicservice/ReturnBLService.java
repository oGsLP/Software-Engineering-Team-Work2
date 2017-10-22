package businesslogicservice;


import vo.ReturnVO;


import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface ReturnBLService {
    public ResultMessage createReceipt(ReturnVO vo);
    public ResultMessage cancelReceipt(ReturnVO vo);
    public ResultMessage finshReceipt(ReturnVO vo);
    public ArrayList<ReturnVO> getReceipt(ReturnVO vo);
    public ResultMessage changeMoney(ReturnVO vo);
}
