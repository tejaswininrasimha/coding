package opps.Abstraction.Interface.Inetrfaces100NotAbstract;

public interface Demo {
    void show();
     default void display(){
         System.out.println("Default Mathod");

    }
    static void message(){
         System.out.println("Static Method");
    }

        }
class Driver{
     public static void main() {
         Demo.message();

    }
}