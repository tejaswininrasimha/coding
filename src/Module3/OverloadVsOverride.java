package Module3;

class Parent {

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    void show() {   // Overriding
        System.out.println("Child method");
    }

    int show(int a) {   // Overloading
        return a;
    }

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();        // Overriding
        obj.show(10);      // Overloading
    }
}

