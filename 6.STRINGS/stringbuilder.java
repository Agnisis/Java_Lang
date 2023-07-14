import java.util.*;
public class stringbuilder { 

    public static void main(String args[]){


        // strings are immutable -> 
        // if we want to modify strings the variable stored at stack and value stored at heap and change in heap cause more time to execute 
        // string builder can be modified at real time in heap in same memory



        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0

       System.out.println(sb.charAt(0)); 

       //set char at index 0
             
       sb.setCharAt(0, 'p');
       System.out.println(sb);

       //insert char at string


       sb.insert(0, 's');
       System.out.println(sb);
       sb.insert(3, 'n');
       System.out.println(sb);



       //delete char or delete string from string builder

       sb.delete(2, 3);
       System.out.println(sb);

       sb.delete(0, 3);
       System.out.println(sb);


       //append -> add char at endof string 

       sb.append('e');  // str=str +'e';
       sb.append('l');  // str=str +'l';
       System.out.println(sb);

       //in caseof every time per addition a new string is created but append of string builder does not make new string just add at the last index


       System.out.println(sb.length());

    }
    
}
