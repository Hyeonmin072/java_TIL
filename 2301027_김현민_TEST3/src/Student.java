public class Student {
    
    String name;
    int kor;
    int eng;
    int mat;
    double avg;
    int rank;

    public Student() {
    }

    public Student(String name, int kor, int eng, int mat, double avg) {
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.avg = avg;
    }
    
    public Student (String value){
        String[] values = value.split("\\s+");
        name = values[0];
        kor = Integer.parseInt(values[1]);
        eng = Integer.parseInt(values[2]);
        mat = Integer.parseInt(values[3]);
        avg = (kor+eng+mat)/3;
    }
    
    public boolean compare(Student cmp){
        if(name.contains(cmp.getName()))
            return true;     
        else
            return false;
                
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return name +", Avg :"+ avg;
    }
    
    
    
    
    
}
