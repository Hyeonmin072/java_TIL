package pkg2301027_김현민_test_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine()); // 몇명의 학생을 받을지
        
        StudentArr[] student = new StudentArr[count]; // count 크기의 배열 생성 ?
        
        for (int i =0 ; i<count; i++){ // count 만큼 반복
            String line=""; // String 타입 line 변수 생성
            try { //예외 처리함수
                line = scan.nextLine(); //예외가 발생할 수도 있는 코드
            } catch (Exception e) { //예외 1번
                count = i; //count에 i를 넣음 (받은 line 개수 만큼 count로 만듬)
                break; // 반복 종료
            }
            if(line.length() < 5){ //만약 입력받은 line이 최소 수인 5를 넘지 못했을 때
                i--; //i를 1을 줄이고
                continue; //다시 시작
            }
            
            student[i] = new StudentArr(line); // 입력받은 이름 점수 점수 점수 ... 값을 student[i]에 넣음
        }
        
        for(int i =0; i<count; i++){ //위에서 설정한 count 만큼 반복
            student[i].getSum(); //합을 받는 메서드 사용
            student[i].getAvg(); //평균을 받는 메서드 사용
        }
        
        for(int i = 0 ; i < count ; i++){
                student[i].setRank(0);
                for(int j = 0 ; j < count ; j++){
                    student[i].getRank(student[j]);
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
