import java.util.*;

class name{
    String nam= "Agnisis";
    public void printNam(){
        System.out.println("name is "+nam);

    }
}
class age{
    int age =10;
    public void printAge(){
        System.out.println("age is "+age);

    }
}
class salary{
    int salary=30000;
    public void printSalary(){
        System.out.println("Salary is "+salary);

    }
}

public class names {
      
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        //  static int a=120;
        salary s1 =new salary();
        s1.printSalary();

    }

}


