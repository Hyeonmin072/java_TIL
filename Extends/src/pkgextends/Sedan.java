package pkgextends;
public class Sedan extends Car {
//    String no;
    int count;

    public Sedan(String no) {
        super(no);
        System.out.println("Sedan : 생성자 호출");
        this.no = no;
        this.count =0;
    }   
    
    
    public int getIn(){
        count++;
        System.out.println("탑승, 총원 : "+count);
        return count;
    }
    
    public int getOut(){
        count--;
        System.out.println("하차, 총원 : "+count);
        return count;
    }
    
    public int load(){
        return getIn();
    }
    
    public int unLoad(){
        return getOut();
    }

    @Override
    public String toString() {
        return "Sedan{" + "no=" + no + ", count=" + count + '}';
    }
    
    
}
