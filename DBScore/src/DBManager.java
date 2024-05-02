/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusal
 */

import java.sql.*;
import java.util.ArrayList;

public abstract class DBManager {
    public static DBManager instance = null;
    
    
    Connection conn;
    
    public DBManager(){
        System.out.println("DBM :: Construct");
        //loadDriver();
        //openConnection();
    }
    
    public abstract void loadDriver();
    //abstract : 상속하려면 반드시 이 메서드를 오버라이드해야함
    //abstract 사용시 해당 클래스 앞에도 abstract를 붙여줘야함
    //public void loadDriver(){System.out.println("DBM::loadDriver");}
    //public void openConnection(){System.out.println("DBM::openConn");}
    public abstract void openConnection();
    
    
    
    public boolean execute(String sql){
        System.out.println(sql);
        boolean ret = false;
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ret = stmt.execute(sql);
        }
        catch (Exception e) {e.printStackTrace();}
        finally {try {stmt.close();} catch (Exception e) {}}
       return ret;
    }
    
    public ArrayList<String[]> executeQuery(String sql){
        System.out.println(sql);
        ArrayList<String[]> list 
                = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            int count = rs.getMetaData().getColumnCount();
            while(rs.next()){
                String[] values = new String[count];
                for (int i = 0; i < count; i++) {
                    values[i] = rs.getString(i+1);
                }
                list.add(values);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {rs.close(); } catch(Exception e){}
            try {stmt.close(); } catch(Exception e){}   
        }
        return list;
    }
    
    
    public int executeUpdate(String sql){
        System.out.println(sql);
        Statement stmt = null;;
        int ret = -1;
        try {
            stmt = conn.createStatement();
            ret = stmt.executeUpdate(sql);
        }
        catch (Exception e) {e.printStackTrace();} 
        finally {try {stmt.close();} catch (Exception e) {}}
        System.out.println(ret+" Row's Update");
        return ret;
    }
    public void closeConnection(){
        try {
            conn.close();
            System.out.println("Connection Close");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
