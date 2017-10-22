package data;

import businesslogicservice.ResultMessage;
import dataservice.ClassifyDataService;
import po.ClassifyPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyDataService_Stub implements ClassifyDataService{
    String name;
    String number;


    public ClassifyDataService_Stub(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    @Override
    public ResultMessage add(ClassifyPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    @Override
    public ResultMessage delete(ClassifyPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    @Override
    public ResultMessage modify(ClassifyPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    @Override
    public ArrayList<ClassifyPO> find(String keywords){
        ClassifyPO po = new ClassifyPO(name, number);//在实现数据库后具体实现
        ArrayList<ClassifyPO> list = new ArrayList<>();
        list.add(po);
        return list;
    }


}
