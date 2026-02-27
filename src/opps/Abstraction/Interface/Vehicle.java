package opps.Abstraction.Interface;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Engine has stoped");

    }
}
class Audi implements Vehicle{
    public  void start(){

        System.out.println("Audi Has Started");
    }
}
class BMW implements Vehicle{
    public void start(){

        System.out.println("BMW Has Started");
    }
}
class RoyalRoceee implements Vehicle{
    public  void start(){

        System.out.println("RoyalRocee Has Started");
    }
}
class Drivers{
    public static void main(String[]args){
        Audi p1= new Audi();
        BMW p2=new BMW();
        p1.start();
        p2.start();
        p1.stop();
    }
}

