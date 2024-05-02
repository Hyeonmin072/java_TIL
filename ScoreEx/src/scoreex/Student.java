package scoreex;

public class Student{ //학생 클래스
  
    private String name;
    private int kor;
    private int mat;
    private int eng;     //변수생성 (해당 값의 접근제어자는 왠만하면 private로)
    private int hap;
    private double avg; 
    private int rank;
    
    public Student(){ //기본 생성자 (입력값이 없을 경우 값)
        this("unknown", -1, -1,-1);
    }
    
    public Student (String name, int kor, int mat, int eng){ //생성자 (입력받은 값을 집어넣는)
        this.name=name;
        this.kor=kor;
        this.mat=mat;
        this.eng=eng;
    }
    
    public int getKor() {
        return kor;
    }
    public void setKor(int kor){
        this.kor=kor;
    }
    
    public int getMat() {
        return mat;
    }
    
    public void setMat(int mat) {
        this.mat=mat;
    }
    
    public int getEng() {
        return eng;
    }
    
    public void setEng(int eng) {
        this.eng=eng;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public int getHap(){
        hap=kor+mat+eng;
        return hap;
    }
    public double getAvg(){
        avg= getHap()/3;
        return avg;
    }    
    public void setRank(int rank){
        this.rank =rank;
        
    }
    public int getRank(Student cmpObj){
        if(cmpObj.getHap()>=this.getHap())
            rank++;
        return rank;
    }
    
        
      

    

}




