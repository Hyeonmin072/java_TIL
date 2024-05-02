package carmgr;
public class Sedan extends Car  {
    
//    String no;
//    int cc = -1;
    
    public Sedan(){}

    public Sedan(String _no) {
        super(_no);
        //System.out.println("Sedan::생성자 호출 : "+ no +", "+cc+"cc");
        this.no = _no;
//        this.cc = 150;
        //System.out.println("Sedan::생성자 호출 : " + no +", "+cc+"cc");
    }

    public void gas(){
        System.out.println("Sedan::GAS : " + no+", "+cc+"cc");
    }
    public void move(){
        System.out.println("Sedan::MOVE : " + no+", "+cc+"cc");
    }
    
    
    
}
