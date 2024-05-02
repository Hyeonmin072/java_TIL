package pkgextends;
public class Car {
    public String no;
    
    public Car(){
        System.out.println("디폴트 생성자 호출");
    }

    public Car(String no) {
        System.out.println("Car: "+"생성자 호출");
        this.no=no;
    }
    
    
    
    
    public int load(){
        System.out.println("Car::load(): ");
        return 1;
    }
    
    public int unLoad(){
        System.out.println("Car::unLoad(): ");
        return -1;
    }

    @Override
    public String toString() {
        return "Car{" + "no=" + no + '}';
    }
    
    
    
    
    
}
