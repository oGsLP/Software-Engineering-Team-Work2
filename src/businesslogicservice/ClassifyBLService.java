package businesslogicservice;

import vo.ClassifyVO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
/**
 * Created by py on 2017/10/19.
 */
public interface ClassifyBLService {
   public ArrayList<ClassifyVO> checkClassify(String node); // To be updated
   public ResultMessage addClassify(ClassifyVO vo);
   public ResultMessage deleteClassify(ClassifyVO vo);
   public ResultMessage modifyClassify(ClassifyVO vo);

}
