package carmgr;
public class Car {
    
    String no="unregisted";
    static int cc = 0;
    static {
        System.out.println("Car Static 호출");
    }
    public Car(){}

    public Car(String _no) {
        //System.out.println("Car:생성자 호출 : " + no +", "+cc+"cc");
        //gas();
        this.no = _no;
        cc++;
        System.out.println("Car:생성자 호출 : " + no);
    }
   

    public void gas(){
        System.out.println("Car::GAS : " + no+", "+cc+"cc");
    }
    public void move(){
        System.out.println("Car::MOVE : " + no+", "+cc+"cc");
    }
    
    
    
}
