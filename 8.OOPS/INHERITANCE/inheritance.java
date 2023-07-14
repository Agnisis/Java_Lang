
import java.util.*;

class Shape {

    String color;
    int dimention;

}

class Triangle extends Shape { // single

    String name;
    int number;

    public void printinfo() {
        System.out.println("Hi its a " + name);
        System.out.println("its color is " + color);
        System.out.println("dimention is " + dimention);
        System.out.println("number is " + number);

    }
}

class Square extends Shape { // single
    String name;
    int number;

    Square(String name, String color, int dimention, int number) {
        System.out.println("name is " + name);
        System.out.println("Dimention is " + dimention);
        System.out.println("number is " + number);
        System.out.println("color is " + color);
    }
}

class Equilateral extends Triangle {
    void print() {
        System.out.println("All sides equal");
    }
};

public class inheritance {
    public static void main(String args[]) {

        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.dimention = 2;
        t1.name = "triangle";
        t1.number = 45;
        t1.printinfo();

        System.out.println("=====================================");

        Square s1 = new Square("square", "green", 3, 45);

        System.out.println("=====================================");
          

        Equilateral e1=new Equilateral();
        e1.print();
    }
}
