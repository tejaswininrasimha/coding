
package Module3;

public class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();  // from Animal class
        d.bark();   // from Dog class
    }
}
