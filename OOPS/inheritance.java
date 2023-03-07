
import java .util.*;


class Shape{

    String color;
    int dimention;

}


class Triangle extends Shape{

    String name;
    int number;
    


    public void printinfo(){
        System.out.println("Hi its a "+name);
        System.out.println("its color is "+color);
        System.out.println("dimention is "+dimention);
        System.out.println("number is "+number);

    }
}
public class inheritance {
    public static void main(String args[]){
  
        Triangle t1=new Triangle();
        t1.color="red";
        t1.dimention=2;
        t1.name="triangle";
        t1.number=45;
        t1.printinfo();
    }
}
