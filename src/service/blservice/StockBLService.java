package service.blservice;

import objects.ResultMessage;

import java.rmi.RemoteException;

/**
 * Created by py on 2017/10/20.
 */
public interface StockBLService {

   public ResultMessage add() throws RemoteException;


}
