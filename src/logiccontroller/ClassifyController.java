package logiccontroller;

import service.blservice.ClassifyBLService;
import objects.ResultMessage;
import vo.ClassifyVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/11/6.
 */
public class ClassifyController implements ClassifyBLService{
    String name;
    String number;
    public ArrayList<ClassifyVO> checkClassify(String node){
        ArrayList<ClassifyVO> lst = new ArrayList<>();
        return lst;

    }// To be updated
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
}
