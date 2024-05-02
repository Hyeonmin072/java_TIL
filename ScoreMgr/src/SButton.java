    
import javax.swing.JButton;

public class SButton extends JButton{
    
    StudentVO studentVO = new StudentVO();

    public SButton() {
        super("");
    }

    public SButton(StudentVO studentVO){ //studentVO객체를 받을 경우
        super(studentVO.toString()); //studentVO객체를 toString
        //StudentVO 클래스는 이름과 평균을 출력하게 toString이 구성되어 있음
        //이 생성자가 호출될 경우 이름과 평균을 출력할것
        this.studentVO = studentVO;
    }
    
    public StudentVO getStudentVO() {
        return studentVO;
    }

    public void setStudentVO(StudentVO studentVO) {
        this.studentVO = studentVO;
        super.setText(studentVO.toString());
    }

    @Override
    public String toString() {
        return studentVO.toString();
    }

    
    
}
