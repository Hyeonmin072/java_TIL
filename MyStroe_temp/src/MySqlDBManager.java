
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
        System.out.println("MySqlDBManager ������ ȣ��");
    }
    public void loadDriver(){
        System.out.println("MySqlDBManager::loadDriver() ����!!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("����̹� �ε� ����!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void openConnection(){
        System.out.println("MySqlDBManager::openConnection() ����!!");
        try {
            System.out.println("Ŀ�ؼ� ���� �õ���...");
            String url = "jdbc:mysql://192.168.235.15:3306/projecta"; // ����Ŭ ���� ���� �ʿ�
            String dbuser = "hyeonmin";
            String dbpasswd = "123";
            conn = DriverManager.getConnection 
                            (url, dbuser, dbpasswd);
            System.out.println("Ŀ�ؼ� ���� ����!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
