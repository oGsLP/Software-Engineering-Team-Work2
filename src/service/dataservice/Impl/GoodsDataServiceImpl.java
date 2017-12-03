package service.dataservice.Impl;

import objects.ResultMessage;
import po.GoodsPO;
import service.dataservice.GoodsDataService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.File;
import java.util.ArrayList;

public class GoodsDataServiceImpl implements GoodsDataService  {
    @Override
    public ResultMessage add(GoodsPO po) {
        if(po == null)
            return null;
        Configuration configuration = new Configuration().configure(new File("hibernate.cfg.xml"));
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(po);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(GoodsPO po) {
        if(po == null)
            return null;
        

    }

    @Override
    public ResultMessage update(GoodsPO po) {
        return null;
    }

    @Override
    public ArrayList<GoodsPO> retrive(String keywords) {
        return null;
    }

    @Override
    public ArrayList<GoodsPO> find(String keywords) {
        return null;
    }


}
