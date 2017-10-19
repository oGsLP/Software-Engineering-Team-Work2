package businesslogicservice;

import vo.ClassifyVO;

import java.util.ArrayList;
/**
 * Created by py on 2017/10/19.
 */
public interface ClassifyBLService {
   public ArrayList<ClassifyVO> checkCommodity();
   public ResultMessage addCommodity(ClassifyVO vo);
   public ResultMessage deleteCommodity(ClassifyVO vo);
   public ResultMessage modifyCommodity(ClassifyVO vo);
   public ArrayList<ClassifyVO> findClassify(String keywords);

}
