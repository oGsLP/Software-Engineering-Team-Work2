package vo;

/**
 * Created by py on 2017/10/19.
 */
public class ClassifyVO {
    String name;
    int number;


    public ClassifyVO(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
}
