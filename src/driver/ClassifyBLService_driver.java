package driver;

import service.blservice.ClassifyBLService;
import objects.ResultMessage;
import vo.ClassifyVO;


import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyBLService_driver {
    public void drive(ClassifyBLService classifyBLService){
       String name = "classify";
       String number = "0001";
       ClassifyVO vo = new ClassifyVO(name, number);
        ResultMessage msg = classifyBLService.addClassify(vo);
        if(msg != null)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = classifyBLService.modifyClassify(vo);
        if(msg1 != null)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = classifyBLService.deleteClassify(vo);
        if(msg2 != null)
            System.out.println("Success");
        else
            System.out.println("Fail");

        String node = ""; // Templeate
        ArrayList<ClassifyVO> list = classifyBLService.checkClassify(node);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
        }

    }

}
