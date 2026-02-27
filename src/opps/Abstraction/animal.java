package opps.Abstraction;

abstract class animal {
    String name;
    animal(){
        name = "XYZ";

    }
     abstract void sound();

    void run(){
    System.out.println("Running");

    }
}
class Lion extends animal {
    void sound() {
        System.out.println("Roars");
    }
}
class cat extends animal {
    void sound(){
        System.out.println("Mewow");
    }
}
class Driver{
    public static  void main(String[] args){
        Lion l = new Lion();
        cat c = new cat();
        c.sound();
        c.run();
    }
}
