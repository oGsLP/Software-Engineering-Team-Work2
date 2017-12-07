package service.blservice.Impl;

import objects.ResultMessage;
import po.ClassifyPO;
import po.GoodsPO;
import service.VOChangeToPO;
import service.blservice.GoodsBLService;
import service.datafactory.DataFactory;
import service.datafactory.DataFactoryImpl;
import vo.ClassifyVO;
import vo.GoodsVO;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Set;

public class GoodsBLServiceImpl implements GoodsBLService {
    DataFactory dataFactory = new DataFactoryImpl();
    VOChangeToPO voChangeToPO = new VOChangeToPO();

    @Override
    public ResultMessage addGoods(GoodsVO vo) throws RemoteException {
        GoodsPO po = voChangeToPO.goodsvo_to_goodspo(vo);
        ResultMessage result = dataFactory.getGoodsDataService().add(po);
        return result;
    }

    @Override
    public ResultMessage deleteGoods(GoodsVO vo) throws RemoteException {
        GoodsPO po = voChangeToPO.goodsvo_to_goodspo(vo);
        ResultMessage result = dataFactory.getGoodsDataService().delete(po);
        return result;
    }

    @Override
    public ResultMessage updateGoods(GoodsVO vo) throws RemoteException {
        GoodsPO po = voChangeToPO.goodsvo_to_goodspo(vo);
        ResultMessage result = dataFactory.getGoodsDataService().update(po);
        return result;
    }

    @Override
    public ArrayList<GoodsVO> findGoods(String number, String name, String type) throws RemoteException {
        int len = 4;
        /**
         * 控制查询号码将int转为string(4)
         */
        while(number.length() < len)
            number = "0" + number;

        ArrayList<GoodsVO> voList = new ArrayList<>();
        ArrayList<GoodsPO> poList = dataFactory.getGoodsDataService().find(number, name, type);

        if(poList.size() == 0)
            return null;
        for(int i = 0; i < poList.size(); i++){
                voList.add(po_to_vo(poList.get(i)));
        }
        return voList;
    }

    @Override
    public ArrayList<GoodsVO> getGoods(ClassifyVO vo) throws RemoteException {
        ArrayList<GoodsVO> goodsList = new ArrayList<>();

        ClassifyPO po = voChangeToPO.classifyvo_to_classifypo(vo);
        Set<GoodsPO> set = po.getGoodsSet();
        for(GoodsPO goodsPO:set){
            goodsList.add(po_to_vo(goodsPO));
        }
        return goodsList;
    }

    private GoodsVO po_to_vo(GoodsPO po){
        GoodsVO vo = new GoodsVO();
        vo.setNumber(po.getNumber());
        vo.setName(po.getName());
        vo.setType(po.getType());
        vo.setCommodityNum(po.getCommodityNum());
        vo.setPurchasePrice(po.getPurchasePrice());
        vo.setRetailPrice(po.getRetailPrice());
        vo.setRecentPurPrice(po.getPurchasePrice());
        vo.setRecentRetPrice(po.getRecentRetPrice());
        return vo;
    }

}
