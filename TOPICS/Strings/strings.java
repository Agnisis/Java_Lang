import java.util.*;

public class strings {




    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name");
        // String name = sc.nextLine(); //input for whole line
        // System.out.println(name);
        // System.out.println("enter a word");
        // String word = sc.next(); // input of single word
        // System.out.println(word);

        //concatenation by variables 

        String firstName="Agnisis";
        String lastName="Dutta";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);


        // default function of strings in java


        //concatenate by function --> (.concat)
        System.out.println(fullName.concat(firstName));

        //length of string --> (.length)
        System.out.println(fullName.length());

        //repeat a string -> (.repeat)
        System.out.println(fullName.repeat(3));


        //fing char at specified index-->(.charAt)
        System.out.println(fullName.charAt(5));


        System.out.println(fullName.compareTo(firstName));







    }
}