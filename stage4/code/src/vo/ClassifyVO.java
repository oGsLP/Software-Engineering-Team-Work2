package vo;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyVO {
    String name;
    String number;


    public ClassifyVO(String name, String number){
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
