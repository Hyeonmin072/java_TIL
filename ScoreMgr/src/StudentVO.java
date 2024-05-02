public class StudentVO {
    String name;
    int kor;
    int eng;
    int mat;
    double avg;

    public StudentVO() {
    } //기본 생성자

    public StudentVO(String name, int kor, int eng, int mat, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.avg = avg;
    }
    
    public StudentVO(String value){
        String[] values = value.split("\\s+");
        name = values[0];
        kor = Integer.parseInt(values[1]);
        eng = Integer.parseInt(values[2]);
        mat = Integer.parseInt(values[3]);        
        avg = kor+eng+mat/3;
    }
    
    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
        getAvg();
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        getAvg(); // << 이거왜하는거지

    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        getAvg();

    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
        getAvg();
    }

    public double getAvg() {
        avg = (kor + eng + mat)/3;
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    public boolean compareTo(StudentVO cmpObj){
        if(name.contains(cmpObj.getName()))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return name + " " + getAvg();
    }

    
    
    
}
