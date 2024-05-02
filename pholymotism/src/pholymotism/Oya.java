package pholymotism;

public class Oya {
    String name;
    
    public Oya(){
        this("");
    }

    public Oya(String name) {
        this.name = name;
        work();
    }
    
    
    public void work() {
        System.out.println("Oya::work()");
        show();
}

    protected void show() {
        System.out.println("Oya::show()");
    }
    }
