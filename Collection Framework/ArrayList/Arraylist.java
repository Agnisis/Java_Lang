import java.util.*;

// non continious , dynamic , build in heap memory 
// arraylist can store only objects
public class Arraylist{

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      
    //   System.out.println("enter the size for array list ");
    //   int size=sc.nextInt();


      ArrayList<Integer> list=new ArrayList<Integer>();
      
      
      //add elements 
      list.add(0);
      list.add(2);
      list.add(3);
      list.add(2);

      System.out.println(list);


      //get elemnts

      int e=list.get(3);
      System.out.println(e);



    }
}