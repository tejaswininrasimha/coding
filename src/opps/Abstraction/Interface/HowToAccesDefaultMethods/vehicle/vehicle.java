package opps.Abstraction.Interface.HowToAccesDefaultMethods.vehicle;

public interface vehicle {
    default void stop(){
        System.out.println("Stopped");
    }
}
class car implements vehicle{
    void carFunction(){
        System.out.println("car function");

    }
}
class bike implements vehicle{
      public void stop(){
        System.out.println("Bike stopeed");
    }
}
class Driver{
    public static void main(String[] args){
        car c1 = new car();
        c1.stop();// 1st way to access default method
        vehicle v = new car();//upcasting (2nd Way)
        v.stop();
        bike b = new bike();
        b.stop();
    }
}