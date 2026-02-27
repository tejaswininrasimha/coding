package opps.Abstraction.contr;

import java.lang.reflect.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal constructor");

    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("Dog barks");
    }

}
class Driver{
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();

    }
}
/* why does abstract class have Constructor?
-> Constructor are used for intializing common data!
->when a child class object is created, the parent class Constructor runs first
->Parent Constructor is getting executed because of inheritance
 */

