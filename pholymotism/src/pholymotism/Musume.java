package pholymotism;

public class Musume extends Oya {
    String name;

    public Musume(String name) {
        this.name = name;
    }
    
    
    public void work() {
        System.out.println("Musume::work()");
        show();
}

    public void show() {
        System.out.println("Musume::show()");
    }
    }
