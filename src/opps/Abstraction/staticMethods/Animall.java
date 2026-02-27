package opps.Abstraction.staticMethods;

abstract class Animal{
    static  void  info(){
        System.out.println("Animals are living being");
    }
    abstract void sound();

}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal.info();
        Dog d = new Dog();
        d.sound();


    }
}
