
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rlarl
 */
public class MySqlDBManager extends DBManager{
        public static DBManager getInstance(){
        if(instance==null)
            instance = new MySqlDBManager();
        return instance;
    }

    public MySqlDBManager() {
        super();
        System.out.println("MySqlDBManager 생성자 호출");
    }
    public void loadDriver(){
        System.out.println("MySqlDBManager::loadDriver() 실행!!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩 성공!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void openConnection(){
        System.out.println("MySqlDBManager::openConnection() 실행!!");
        try {
            System.out.println("커넥션 열기 시도중...");
            String url = "jdbc:mysql://192.168.235.15:3306/projecta"; // 오라클 사용시 변경 필요
            String dbuser = "hyeonmin";
            String dbpasswd = "123";
            conn = DriverManager.getConnection 
                            (url, dbuser, dbpasswd);
            System.out.println("커넥션 열기 성공!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
