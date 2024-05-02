/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author rlarl
 */
public abstract class DBManager {
    public static DBManager instance = null;

    Connection conn;

    public DBManager() {
        System.out.println("DBManager ������ ȣ��");
        loadDriver();
        openConnection();
    }
    public abstract void loadDriver();
//    public void loadDriver() {
//        System.out.println("DBManager::loadDriver() ����!!");
//    }
    public abstract void openConnection();
//    public void openConnection() {
//        System.out.println("DBManager::openConnection() ����!!");
//    }
    public int executeUpdate(String sql){   
            System.out.println(sql);
            int ret=-1;
            Statement stmt = null;
            try {
                stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }
            return ret;
    }
    
    
    public boolean execute(String sql){
        System.out.println(sql);
        boolean ret = false;
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ret = stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();} catch (Exception e) {}
        }
        return ret;
    }
    
    public void executeQuery(String sql, JComboBox cmb, int viewIndex, int keyIndex){
        System.out.println(sql);
        Statement stmt = null;   
        ResultSet rs = null;
        cmb.removeAllItems();
        try {
            stmt = conn.createStatement(); // createStatement =�������� ��ü���� stmt �������̽� ��´�
            rs = stmt.executeQuery(sql);  // = �����ͺ��̽��� ���� �ٷ� , ���� rs���
            int count = rs.getMetaData().getColumnCount(); //MetaData = �÷��� �÷��� �÷�Ÿ�Ե�
            while(rs.next()){     // ���� �����ϱ� true
                String[] values = new String[count]; // values [0] [1] [2] [3] [4] [5]
                for (int i = 0; i < count; i++) {    //       2  ������ 98    
                    values[i] = rs.getString(i+1);
                }
                KeyValues kv = new KeyValues(values, viewIndex, keyIndex);
                cmb.addItem(kv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {rs.close(); } catch(Exception e){}
            try {stmt.close(); } catch(Exception e){}   
        }
    }
    
    
    public void closeConnection(){
        try {
            conn.close();
            System.out.println("Ŀ�ؼ� ����!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
