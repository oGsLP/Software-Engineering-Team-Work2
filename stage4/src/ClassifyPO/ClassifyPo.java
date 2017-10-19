package ClassifyPO;

import java.io.Serializable;

/**
 * Created by py on 2017/10/18.
 */
public class ClassifyPo implements Serializable{
    String name;
    String number;


    public ClassifyPo(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
}
