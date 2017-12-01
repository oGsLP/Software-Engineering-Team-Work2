package logiccontroller;

import service.blservice.MemberBLService;
import objects.ResultMessage;
import vo.MemberVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/11/21.
 */
public class MemberController implements MemberBLService{
    String number = "0001";          //编号
    String memberClass = "salesman";        //分类（进货商、销售商）
    int level = 3;              //级别（五级，一级普通用户，五级VIP客户）
    String name = "py";            //姓名
    String phoneNumber = "86212321";     //电话
    String address = "NJU";         //地址
    String postcode = "000001";        //邮编
    String mailAddress = "panyuyuyu@outlook.com";     //电子邮箱
    long collectionLimit = 4000;   //应收额度
    long collection = 2000;        //应收
    long payment = 3000;           //应付
    String managePerson = "Xiao";    //默认业务员

    MemberVO vo = new MemberVO(number, memberClass, level, name, phoneNumber, address,
            postcode, mailAddress, collectionLimit, collection, payment, managePerson);

    public ResultMessage add(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ResultMessage delete(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ResultMessage modify(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ArrayList<MemberVO> find(String keywords){
        ArrayList<MemberVO> list = new ArrayList<>();
        if(contain(vo, keywords))
            list.add(vo);
        return list;

    }
    public static boolean contain(MemberVO vo, String keywords){
      if(vo.getNumber() == keywords || vo.getMemberClass() == keywords || Integer.toString(vo.getLevel()) ==
              keywords || vo.getName().contains(keywords) || vo.getPhoneNumber().equals(keywords) ||
              vo.getAddress().contains(keywords) || vo.getPostcode().equals(keywords) ||
              vo.getMailAddress().contains(keywords) || Long.toString(vo.getCollection()).equals(keywords) ||
              Long.toString(vo.getCollectionLimit()).equals(keywords) || Long.toString(vo.getPayment()).
              equals(keywords) || vo.getManagePerson().equals(keywords))
          return true;
      return false;
    }

}
