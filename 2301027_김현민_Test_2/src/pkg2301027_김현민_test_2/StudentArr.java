package pkg2301027_김현민_test_2;



public class StudentArr {
    
    String name;
    int[] scores;
    String[] values;
    int rank;
    
        public StudentArr(String value){
        values = value.replaceAll("  ", " ").split(" ");
        scores = new int[values.length-1]; //scores 배열 생성 (이름을 뺀 길이를 만들어야하기때문에 -1)
        name = values[0]; // 입력 받은 문자열을 스페이스바 기준으로 나눴을때 첫번째가 이름이기 때문에 0번째를 저장
        for (int i =0; i<values.length-1; i++){
            scores[i] = Integer.parseInt(values[i+1]); // values 배열을 string 타입이기 때문에
                                                         //integer타입으로 강제로 변경하고 scores에 순서대로 넣는다
        }                                                //이름은 빼고 넣어야하므로  values[i+1]
    }

    public int getSum() {
        int sum = 0;
        for (int i =0; i<scores.length; i++){
            sum +=scores[i];
        }
        return sum;
    }

    public double getAvg(){
        return getSum()/3;
    }
    
    public int getRank(StudentArr obj){
        if(obj.getSum()>=this.getSum())
            rank++;
        return rank;
        
    }

    @Override
    public String toString() {
        return "StudentArr{" + "name=" + name + ", scores=" + scores + ", values=" + values + '}';
    }

    public void setRank(int rank){
        this.rank = rank;
    }


    
    
    
    
}
