package scoreex;

import java.io.File;
import java.util.Scanner;


public class ScoreEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\Users\\gusal\\Desktop\\101.dat"));
            int count = 100;
            AdaptiveStudent[] adaptiveStudents = new AdaptiveStudent[count];
            int i = 0; 
            for(i = 0; i < count ; i++){
                String line ="";
                try {
                    line = scn.nextLine();
                } catch (Exception e) {
                    count = i;
                    break;
                }
               
                if(line.length() < 5){
                    i--;
                    continue;                                                                                                                                                                                                                                                                                             
                }
                    
                adaptiveStudents[i] = new AdaptiveStudent(line);
                
            }
            for(i = 0 ; i < count ; i++){
                adaptiveStudents[i].getHap();
                adaptiveStudents[i].getAvg();
            }
            
            for(i = 0 ; i < count ; i++){
                adaptiveStudents[i].setRank(1);
                for(int j = 0 ; j < count ; j++){
                    adaptiveStudents[i].compareRank(adaptiveStudents[j]);
                }
            }
            for (i = 0; i < count; i++) {
                System.out.println(adaptiveStudents[i]);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        
    }
    
}