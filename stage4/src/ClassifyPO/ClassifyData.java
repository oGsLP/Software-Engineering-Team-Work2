package ClassifyPO;

import java.util.ArrayList;
/**
 * Created by py on 2017/10/18.
 */
public interface ClassifyData {
    public boolean add(ClassifyPo clas);
    public ArrayList<ClassifyPo> exceptionFind();
    public boolean delete(ClassifyPo clas);
    public boolean modify(ClassifyPo clas);
    public ArrayList<ClassifyPo> find(String clas);
}
