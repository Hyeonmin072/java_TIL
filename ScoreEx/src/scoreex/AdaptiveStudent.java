
package scoreex;

public class AdaptiveStudent {
    String[] values;
    int[] scores;
    String name;
    int rank;

    public AdaptiveStudent() {
    }

    

    public AdaptiveStudent(String value) {
        values = value.replaceAll("  ", " ").replaceAll("  ", " ").split(" ");
        scores = new int[values.length - 1];
        name = values[0];
        for(int i = 0 ; i < values.length - 1 ; i++)
            scores[i] = Integer.parseInt(values[i+1]);
    }
    
    public AdaptiveStudent(String[] values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
        
    }
    
    public int getHap() {
        int hap = 0;
        for(int i = 0; i < scores.length; i++){
            hap += this.scores[i];
        }
        return hap;
    }
    
    public double getAvg(){
        return 1.0 * getHap() / scores.length;
    }
    
    public int compareRank(AdaptiveStudent obj){
        if(this.getHap() < obj.getHap())
            rank ++;
        return rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String value = name + ",";
        for(int i = 0; i < scores.length; i++){
            value += scores[i] + ",";
        }
        value += "     " + getHap() + ",  " + getAvg() + ", " + rank;
        return value;
    }
}
