
package module2;

public class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Not Assigned";
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(); // default
        Student s2 = new Student(101, "Tejaswini"); // parameterized

        s1.display();
        System.out.println("--------");
        s2.display();
    }
}
