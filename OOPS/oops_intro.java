import java.util.*;

class Pen {
    String color;
    String type;

    public void write() {

        System.out.println("Write something !!!");
    }

    public void printcolor() {
        System.out.println(this.color);
    }

    public void printtype() {
        System.out.println(this.type);
    }
}

class Student {

    String name;
    int age;

    public void printname() {
        System.out.println(this.name);
    }

    public int voting() {
        if (this.age > 18) {
            System.out.println(this.name + " yes you can vote to iei");
        } else {
            System.out.println(this.name + " sorry you cant vote to iei");
        }
        return 0;
    }
}

class Cons {

    int age;
    String name;

    // default constructor or non parameterized constructor
    Cons() {
        System.out.println("Constructor called");
    }

    // parameterised cosnstructor
    Cons(int age, String name) {
        this.name = name;
        this.age = age;

    }

    //copy constructor
    Cons(Cons c2){
        this.name=c2.name;
        this.age=c2.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

class des{ 

    // there is no use if destructor in java as its automatically called when object is destroyed by garbage collecter

}

public class oops_intro {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Pen cello = new Pen();
        Pen amigo = new Pen();

        cello.color = "Blue";
        cello.type = "Dot pen";
        cello.write();
        cello.printcolor();
        cello.printtype();

        amigo.color = "black";
        amigo.type = "gel pen";
        amigo.write();
        amigo.printcolor();
        amigo.printtype();

        System.out.println("============================================");

        Student s1 = new Student();
        System.out.println("Enter name of student ");
        s1.name = sc.next();
        System.out.println("Enter age of student ");
        s1.age = sc.nextInt();

        s1.printname();
        s1.voting();

        System.out.println("============================================");

        Cons c1 = new Cons();
        c1.display();

        Cons c2 = new Cons(20, "agnisis");
        c2.display();
            

        Cons c3=new Cons(c2);
        c3.display();

        System.out.println("============================================");

    }
}