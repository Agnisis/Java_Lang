/* polymorphism -> many forms 

type 1 : compile time
function overloading->
return type same-argument diff
return type diff-arguu same
return type same-arrgu same- nop of argu diff

 */

class Employee {
    String name;
    String company;
    int id;
    float salary;

    public void printinfo(String name) {
        System.out.println(this.name = name);
    }

    public void printinfo(int id) {
        System.out.println(this.id = id);
    }
    
    public void printinfo(String name,String company){
        
        System.out.println((this.name=name)+" "+(this.company=company));
    }
}

public class polymorphism {

    public static void main(String args[]) {

        Employee e1 = new Employee();
        e1.printinfo("Agnisis");
        e1.printinfo(100);
        e1.printinfo("Agnisis Dutta","TCS");
    }

}
