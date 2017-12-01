package service.blservice;

import objects.ResultMessage;
import vo.ClassifyVO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
/**
 * Created by py on 2017/10/19.
 */
public interface ClassifyBLService extends Remote{
   /*
   * @*/
   public ArrayList<ClassifyVO> checkClassify(String node) throws RemoteException; // To be updated
   public ResultMessage addClassify(ClassifyVO vo) throws RemoteException;
   public ResultMessage deleteClassify(ClassifyVO vo) throws RemoteException;
   public ResultMessage modifyClassify(ClassifyVO vo) throws RemoteException;

}
