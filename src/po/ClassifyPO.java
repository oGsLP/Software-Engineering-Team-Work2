package po;

import java.io.Serializable;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyPO implements Serializable{
    String name;
    String number;


    public ClassifyPO(String name, String number){
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
