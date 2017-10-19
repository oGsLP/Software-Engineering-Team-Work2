package po;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyPO {
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
