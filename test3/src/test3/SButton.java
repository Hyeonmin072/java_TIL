package test3;

import javax.swing.JButton;

public class SButton extends JButton{
    
    Student student = new Student();
    
    public SButton(){
        super("");
    }
    
    public SButton(Student student){
        super(student.toString());
        this.student = student;
    }
    
    public void setStudent(Student student){
        this.student=student;
        super.setText(student.toString());
    }

    @Override
    public String toString() {
        return student.toString();
    }
    
    
}
