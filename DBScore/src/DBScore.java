
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gusal
 */

public class DBScore extends javax.swing.JFrame {
    DBManager db;
    
    public DBScore(){
        initComponents();
        db = MySqlDBManager.getInstance();
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jModelPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNameTxt = new javax.swing.JTextField();
        jKorTxt = new javax.swing.JTextField();
        jEngTxt = new javax.swing.JTextField();
        jMathTxt = new javax.swing.JTextField();
        jAvgTxt = new javax.swing.JTextField();
        jCommandPnl = new javax.swing.JPanel();
        jInsertBtn = new javax.swing.JButton();
        jDeleteBtn = new javax.swing.JButton();
        jSearchBtn = new javax.swing.JButton();
        jUpdateBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jResultPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jModelPnl.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setText("이름");
        jModelPnl.add(jLabel1);

        jLabel2.setText("국어");
        jModelPnl.add(jLabel2);

        jLabel3.setText("영어");
        jModelPnl.add(jLabel3);

        jLabel4.setText("수학");
        jModelPnl.add(jLabel4);

        jLabel5.setText("평균");
        jModelPnl.add(jLabel5);
        jModelPnl.add(jNameTxt);
        jModelPnl.add(jKorTxt);
        jModelPnl.add(jEngTxt);
        jModelPnl.add(jMathTxt);
        jModelPnl.add(jAvgTxt);

        jCommandPnl.setLayout(new java.awt.GridLayout(2, 0));

        jInsertBtn.setText("추가하기");
        jInsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jInsertBtn);

        jDeleteBtn.setText("삭제하기");
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jDeleteBtn);

        jSearchBtn.setText("조회하기");
        jSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jSearchBtn);

        jUpdateBtn.setText("변경하기");
        jUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jUpdateBtn);

        jButton4.setText("jButton4");
        jCommandPnl.add(jButton4);

        jButton6.setText("jButton6");
        jCommandPnl.add(jButton6);

        jResultPnl.setLayout(new java.awt.GridLayout(0, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jModelPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCommandPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jResultPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jModelPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCommandPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jResultPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //db.closeConnection();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("Window Close");
        db.closeConnection();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        System.out.println("Window Open");
    }//GEN-LAST:event_formWindowOpened

    private void jSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchBtnActionPerformed
        ArrayList<String[]> list = db.executeQuery("select * from student");
        jResultPnl.removeAll();
        for (String[] values : list){
            JButton obj = new JButton(values[0] + "-" + values[1]);
            jResultPnl.add(obj);
        }
        this.pack();
    }//GEN-LAST:event_jSearchBtnActionPerformed

    private void jInsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertBtnActionPerformed
        String sql = "insert into student(name, kor, eng, math) values("
                + "'"+this.jNameTxt.getText() + "'"
                + ",'"+this.jKorTxt.getText()+"'"
                + ",'"+this.jEngTxt.getText()+"'"
                + ",'"+this.jMathTxt.getText()+"')";
        db.executeUpdate(sql);
    }//GEN-LAST:event_jInsertBtnActionPerformed

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        String nameToDelete = jNameTxt.getText();
        String sql = "DELETE FROM student WHERE name = '" + nameToDelete + "'";
        db.executeUpdate(sql);
    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateBtnActionPerformed
        String sql;
        String nameToUpdate = jNameTxt.getText();
        String korScore = jKorTxt.getText();
        String engScore = jEngTxt.getText();
        String mathScore = jMathTxt.getText();
        if(korScore==null){
            sql = "UPDATE student SET kor = '"+null+"'"+
                ",eng = '"+engScore+"'"+
                ",math = '"+mathScore+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        else if(engScore==null){
            sql = "UPDATE student SET kor = '"+korScore+"'"+
                ",eng = '"+null+"'"+
                ",math = '"+mathScore+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        else if(mathScore==null){
            sql = "UPDATE student SET kor = '"+korScore+"'"+
                ",eng = '"+engScore+"'"+
                ",math = '"+null+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        
        else if(korScore==null && engScore==null){
            sql = "UPDATE student SET kor = '"+null+"'"+
                ",eng = '"+null+"'"+
                ",math = '"+mathScore+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        else if(engScore==null && mathScore==null){
            sql = "UPDATE student SET kor = '"+korScore+"'"+
                ",eng = '"+null+"'"+
                ",math = '"+null+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        else if(mathScore==null && korScore==null){
             sql = "UPDATE student SET kor = '"+null+"'"+
                ",eng = '"+engScore+"'"+
                ",math = '"+null+"'"+
                "WHERE name = '"+nameToUpdate+"'";}
        else{
             sql = "UPDATE student SET kor = '"+korScore+"'"+
                ",eng = '"+engScore+"'"+
                ",math = '"+mathScore+"'"+
                "WHERE name = '"+nameToUpdate+"'";
        }
            db.executeUpdate(sql);
        
    }//GEN-LAST:event_jUpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DBScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAvgTxt;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jCommandPnl;
    private javax.swing.JButton jDeleteBtn;
    private javax.swing.JTextField jEngTxt;
    private javax.swing.JButton jInsertBtn;
    private javax.swing.JTextField jKorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMathTxt;
    private javax.swing.JPanel jModelPnl;
    private javax.swing.JTextField jNameTxt;
    private javax.swing.JPanel jResultPnl;
    private javax.swing.JButton jSearchBtn;
    private javax.swing.JButton jUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
