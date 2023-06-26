

import java.util.*;

interface Pulsar{
    // only variables -->>>fixed (final static) 
    // abstract function declaration ->>>> implemented in class who implement this
    String name="ns";
    void name();

}
 class Shilpi implements Pulsar{
      
    
    public void name(){
        
        int b=160;
       System.out.println("my fav bike");
        System.out.println(name+b);
    }
 }

 class Agnisis implements Pulsar{
      static void hi(){
        System.out.println("llllll");
          }
    public void name(){
        
        int c=200;
       
        System.out.println(name+c);
    }
 }

public class interface_introduction{
    
    // defination of function from In
          
    

    
    //main function / driver code 
    public static void main(String []Args)
    {
       

        interface_introduction tx=new interface_introduction();

     Agnisis ag=new Agnisis();
     Shilpi sh=new Shilpi();

     ag.name();
     sh.name();


    
     
        
    
    }
}


interface question{

    int  vsat=10;
    int sat=15;
    int lat=45;

    void question_vsat();
    void question_sat();
    void question_lat();
}


class mems implements question{
        

    public void question_vsat(){
System.out.println("write newtons colloing law?");
    }
    public void question_sat(){
        
    }public void question_lat(){
        
    }

}
class oops implements question{

    public void question_vsat(){
System.out.println("what is class ?");
    }
    public void question_sat(){
        
    }public void question_lat(){
        
    }

}

