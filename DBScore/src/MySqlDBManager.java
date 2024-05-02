
import java.sql.*;

public class MySqlDBManager extends DBManager{
    public static DBManager getInstance(){ //인스턴스 겟 함수
        if(instance ==null) // 만약 인스턴스가 null이라면
            instance = new MySqlDBManager(); // 새로운 인스턴스 객체 생성
        
        return instance; //인스턴스 리턴
    }

    public MySqlDBManager() {
        super();
        System.out.println("MySqlDBM :: Constructor");
    }
    
    public void loadDriver(){
        try{
            System.out.println("MySql::loadDiver");
            Class.forName("com.mysql.jdbc.Driver"); //오라클 사용시 변경 필요
            System.out.println("Driver Loding Complete");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void openConnection(){
        try {
            System.out.println("MySql:openConn");
            System.out.println("Connection Try,,");
            String url = "jdbc:mysql://192.168.235.15:3306/projecta"; // 오라클 사용시 변경 필요
            String dbuser = "hyeonmin";
            String dbpasswd = "123";
            conn = DriverManager.getConnection(url,dbuser,dbpasswd);
            System.out.println("Connection Open");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
