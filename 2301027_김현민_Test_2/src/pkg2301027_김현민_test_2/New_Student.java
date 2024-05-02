package pkg2301027_김현민_test_2;


public class New_Student {
    String name;
    String[] values;
    int sub;
    int score1;
    int score2;
    int score3;
    int scores[];
    int rank;
    double avg;
    
    public New_Student(String line){
        this("nameless",0,0,0);
    }
    public New_Student(String name, int score1, int score2, int score3){
        this.name=name;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }
    
    
    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }
    public int getScore3(){
        return score3;
    }
    public String getName(){
        return name;
    }


    
    
    
    
    public void setScore1(int score1){
        this.score1=score1;
    }
    public void setScore2(int score2){
        this.score2=score2;
    }
    public void setScore3(int score3){
        this.score3=score3;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRank(int rank){
        this.rank = rank;
    }

    public int getSum() {
        int sum = 0;
        for (int i =0; i<scores.length; i++){
            sum +=scores[i];
        }
        return sum;
    }
    
    
    
        
    
    
    
    
}
