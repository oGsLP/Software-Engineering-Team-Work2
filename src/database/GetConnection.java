package database;
import java.sql.*;

public class GetConnection {
    public static void main(String[] args){
        Connection con = null;
        Statement sta = null;
        ResultSet res = null;
        String sql = null;
        String url = new String("jdbc:mysql://localhost:3306/system?characterEncoding=utf8&useSSL=false");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","1212hjkl");
            sta = con.createStatement();
            System.out.println("Connected to database...");
            sql = new String("select * from Goods");
            res = sta.executeQuery(sql);
            System.out.println("编号     名称     型号     库存数量     进价     零售价     最近进价     最近零售价");
            while(res.next()){
                System.out.print(res.getString("编号"));
                System.out.print("     ");
                System.out.print(res.getString("名称"));
                System.out.print("     ");
                System.out.print(res.getString("型号"));
                System.out.print("     ");
                System.out.print(res.getInt("库存数量"));
                System.out.print("          ");
                System.out.print(res.getInt("进价"));
                System.out.print("     ");
                System.out.print(res.getInt("零售价"));
                System.out.print("      ");
                System.out.print(res.getInt("最近进价"));
                System.out.print("      ");
                System.out.print(res.getInt("最近零售价") + "\n");
            }
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException");

        }catch (SQLException a){
            System.out.println("Fail to connect to database!");
        }
        catch (Exception b){

        }
        finally {
            try{
                if(con != null)
                    con.close();
                if (sta != null)
                    sta.close();
                if(res != null)
                    res.close();
            }catch (Exception e){

            }
        }
    }

}