package driver;

import businesslogicservice.ClassifyBLService;
import vo.ClassifyVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyBLService_driver {
    public void drive(ClassifyBLService classifyBLService){
        ArrayList<ClassifyVO> list = classifyBLService.checkCommodity();
        for(int i = 0; i < list.size(); i++){
            ClassifyVO vo  = list.get(i);
            System.out.println(vo.getName());
            System.out.println(vo.getNumber());
        }

    }

}
