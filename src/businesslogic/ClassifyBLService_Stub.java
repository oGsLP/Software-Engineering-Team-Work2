package businesslogic;

import service.blservice.ClassifyBLService;
import objects.ResultMessage;
import vo.ClassifyVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyBLService_Stub implements ClassifyBLService{
    String name;
    String number;


    public ClassifyBLService_Stub(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public ArrayList<ClassifyVO> checkClassify(String node){
        ArrayList<ClassifyVO> list = new ArrayList<>();
        ClassifyVO vo = new ClassifyVO(name, number);
        list.add(vo);
        return list;
    }
    public ResultMessage addClassify(ClassifyVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage deleteClassify(ClassifyVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage modifyClassify(ClassifyVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ArrayList<ClassifyVO> findClassify(String keywords){
        ArrayList<ClassifyVO> list = new ArrayList<>();
        return list;    //数据库实现后具体实现
    }
}
