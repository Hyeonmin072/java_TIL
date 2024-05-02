
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusal
 */
public class Button extends JButton {
    Student student = new Student();
    public Button() {
    }
    
    public Button(Student student){
        super(student.toString());
        this.student = student;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(){
        this.student = student;
        super.setText(student.toString());
    }

    @Override
    public String toString() {
        return student.toString();
    }
    
    
        
    
    
}
