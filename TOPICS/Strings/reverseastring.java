import java.util.*;
public class reverseastring {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string");
        
        String st=sc.next();
        StringBuilder sb= new StringBuilder(st);

        
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int last=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char lastChar=sb.charAt(last);

            sb.setCharAt(front, lastChar);
            sb.setCharAt(last, frontChar);


        }

        System.out.println(sb);

        sc.close();
        
    }
    
}
