public class New_Student{
    String name="";
    String[] nameArr;
    int score=0;
    int[][] scoreArr;
    int rank=1;
    int[] RankArr;

    public New_Student() {
    }
    
    public int getSum(){
        int sum = 0;
        for (int i = 0; i<scoreArr.length; i++){
            for(int j = 0 ; j<nameArr.length; j++){
                sum += this.scoreArr[i][j];
            }
                
        }       
        return sum;
    }
    
    
    
}
