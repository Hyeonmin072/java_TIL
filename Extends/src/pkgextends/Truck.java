package pkgextends;
public class Truck extends Car {
    //String no;
    int weight;
    
    public Truck(String no){
        super(no);
        System.out.println("Truck 생성자 호출");
        this.no = no;
        weight = 0;
    }
    
    public int load(){
        System.out.println("적재, 총 적재량 : "+weight);
        return weight;
    }
    public int unLoad(){
        weight--;
        System.out.println("하역, 총 적재량 : "+weight);
        return weight;
    }

    @Override
    public String toString() {
        return "Truck{" + "no=" + no + ", weight=" + weight + '}';
    }
    
    
    
    
}
