
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rlarl
 */
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        System.out.println("몇 명");
        count = in.nextInt();
        String[] name = new String[count];
        int[][] sc1 = new int[count][3];
        int[] hap = new int[count];
        double[] avg = new double[count];
        String[] grade = new String[count];
        int[] rank = new int[count];
        System.out.println("이름과 성적 3개 입력");
        for (int i = 0; i < count; i++) {
            name[i] = in.next();
            sc1[i][0] = in.nextInt();
            sc1[i][1] = in.nextInt();
            sc1[i][2] = in.nextInt();
        }
        for (int i = 0; i < count; i++) {
            hap[i] = sc1[i][0] + sc1[i][1] + sc1[i][2];
            avg[i] = hap[i] /3.;
        }
        for (int i = 0; i < count; i++) {
            if (avg[i] >= 95) {
                grade[i] = "A+";
            }
            else if (avg[i] >= 90) {
                grade[i] = "A";
            }
            else if (avg[i] >= 85) {
                grade[i] = "B+";
            }
            else if (avg[i] >= 80) {
                grade[i] = "B";
            }
            else
                grade[i] = "F";
        }
        for (int i = 0; i < count; i++) {
            rank[i] = 1;
            for (int j = 0; j < count; j++) {
                if (avg[i] < avg[j]) {
                    rank[i]++;
                }
            } 
        }
            
        
        
        for (int i = 0; i < count; i++) {
            System.out.println(name[i] + " " + sc1[i][0] + " " + sc1[i][1] + " " + sc1[i][2] + " "+ hap[i] + " "
                    + avg[i] + " " + grade[i] + " " + rank[i]);
        }
        for (int i =1; i<=count; i++){
            for (int j=0; j<count; j ++){
                if(i == rank[j]){
                    System.out.println(rank[j]+"등" +name[j]);
                    for(int l =0; l<=2; l++){
                        System.out.print(sc1[l][j]+" ");
                     
        }        
    }
        }
}}}
