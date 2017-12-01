package service.blservice;

import objects.ResultMessage;
import vo.MemberVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface MemberBLService {
    public ResultMessage add(MemberVO vo);

    public ResultMessage delete(MemberVO vo);

    public ResultMessage modify(MemberVO vo);

    public ArrayList<MemberVO> find(String keywords);
}
