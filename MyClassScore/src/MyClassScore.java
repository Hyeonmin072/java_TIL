import java.io.File;
import java.util.Scanner;

public class MyClassScore {
    public static void main(String[] args) {
        try {
            System.out.println("몇 명 하시겠습니까 ? ");
            Scanner in = new Scanner(new File("D:\\in.dat"));
            int count  = in.nextInt();
            System.out.println("몇 과목 하시겠습니까 ?");
            int subCount =in.nextInt();
            String[] name = new String[count];
            int[] sc1 = new int[count];
            int[] sc2 = new int[count];
            int[] sc3 = new int[count];
            int[][] sc = new int[count][subCount];
            
            System.out.println("이름과 3과목 성적을"+count+"번 입력하세요");
            for(int i=0; i<count; i++){

                name[i] =in.next();
                for (int j = 0; j < subCount; j++) {
                       sc[j][i] =in.nextInt();

                }
                sc1[i] =in.nextInt();
                sc2[i] =in.nextInt();
                sc3[i] =in.nextInt();
            }
            
                int[] hap =new int[count];
                
                double[] avg = new double[count];
                
                for (int i = 0; i < count; i++) {
                     hap[i]=sc1[i] + sc2[i]+sc3[i];
                     avg[i]=hap[i]/3.;
            }
                for (int i = 0; i < count; i++) {
                       System.out.println(name[i]+" "+ sc1[i]+" "+ sc2[i]+" "+sc3[i]+" "+hap[i]+" "+avg[i]+" "+rank[i]);
            }
                int[] rank = new int[count];
                for (int i = 0; i < count; i++) {
                    rank[i]=0;
                    for (int j =0; j<count; j++){
                        if(hap[i] < hap[j]){
                            rank[i]++;
                        }
            }
        } catch (Exception e) {
            
        }
    }
    
}
