package driver;

import service.blservice.MemberBLService;
import objects.ResultMessage;
import vo.MemberVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class MemberBLService_driver {
    public void drive(MemberBLService memberBLService){
        MemberVO vo = new MemberVO("0001", "sale", 5, "py", "88888888",
                "Nanjing", "023112", "panyuyuyu@outlook.com", 5000,
                2000, 1000, "employee1");

        ResultMessage msg = memberBLService.add(vo);
        if(msg != null)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = memberBLService.delete(vo);
        if(msg1 != null)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = memberBLService.modify(vo);
        if(msg2 != null)
            System.out.println("Success");
        else
            System.out.println("Fail");


        ArrayList<MemberVO> list = memberBLService.find("0001");
        for(int i = 0; i < list.size(); i++){
            MemberVO vo1 = list.get(i);
            System.out.println(vo1.getNumber());
            System.out.println(vo1.getMemberClass());
            System.out.println(vo1.getLevel());
            System.out.println(vo1.getName());
            System.out.println(vo1.getPhoneNumber());
            System.out.println(vo1.getAddress());
            System.out.println(vo1.getPostcode());
            System.out.println(vo1.getMailAddress());
            System.out.println(vo1.getCollectionLimit());
            System.out.println(vo1.getCollection());
            System.out.println(vo1.getPayment());
            System.out.println(vo1.getManagePerson());
        }
    }
}
