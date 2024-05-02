import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("과목 수 입력: ");
        int count = scan.nextInt();//과목 수
        int[] scoreArr = new int[count];
        
        System.out.print("학생 수 입력: "); 
        int studentCount = scan.nextInt(); // 학생 수 입력
        String[] nameArr = new String[studentCount]; // 학생 수 배열
        int[][] scores = new int[studentCount][count];
        
                
         
        for(int i =0; i<studentCount; i++){             
             System.out.print("학생 이름 입력: ");
             String name = scan.next();         
             nameArr[i]= name;
             }
        
        
        for (int i =0; i<count; i++){
            for(int j =0; j<studentCount; j++){
                System.out.print(nameArr[i]+"의"+(j+1)+"번째 성적 입력 :");
                int score = scan.nextInt();
                scores[i][j] = score;
        }
        
        for (int i =0; i<count; i++){
            scores[0][i].getSum();
        }
    }
    }
    
    
         
         
         
         
         
        
        
}

