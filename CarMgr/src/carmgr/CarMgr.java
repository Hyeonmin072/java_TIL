package carmgr;
public class CarMgr {

    public static void main(String[] args) {
        
        
        Car car = new Sedan("1234");
        System.out.println("cc: "+Car.cc);
        car = new Sedan("4564");
        System.out.println("cc: "+Car.cc);
        car = new Truck("7656");
        System.out.println("cc: "+Car.cc);
        
        
//        car.gas();
//        car.move();
//        if (car instanceof Sedan)
//            System.out.println("Sedan 객체입니다.");
//        else if (car instanceof Truck)
//            System.out.println("Truck 객체입니다.");
//        
//        System.out.println("=========================================");
//                
//        car = new Truck("4567");
//        car.gas();
//        car.move();
                
    }
    
}
