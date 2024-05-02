package pkgextends;

public class Extends {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan("9542");
        mySedan.load();
        mySedan.load();
        mySedan.unLoad();
        mySedan.unLoad();
        System.out.println(mySedan);
        
        
        Truck myTruck = new Truck("4875");
        myTruck.load();
        myTruck.load();
        myTruck.unLoad();
        myTruck.unLoad();
        System.out.println(myTruck);
        
        Car car = new Car("4554");
        
    }
    
}
