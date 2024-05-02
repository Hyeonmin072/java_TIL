package carmgr;
public class Truck extends Car {
    
//    String no;
//    int cc = -1;
    public Truck(){}

    public Truck(String _no) {
        super(_no);
        this.no = no;
//        this.cc = 350;
        //System.out.println("Truck::생성자 호출 : " + no +", "+cc+"cc");
    }

    public void gas(){
        System.out.println("Truck::GAS : " + no+", "+cc+"cc");
    }
    public void move(){
        System.out.println("Truck::MOVE : " + no+", "+cc+"cc");
    }
    
    
    
}
