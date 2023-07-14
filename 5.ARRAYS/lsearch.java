import java.util.*;


public class lsearch {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array ");
int len=sc.nextInt();
int[] arr=new int[len];
System.out.println("Enter the elements of the array");
for(int i=0;i<len;i++){
arr[i]=sc.nextInt();
}

System.out.println("Enter the element to be searched ->");
int s=sc.nextInt();

for(int i=0;i<len;i++){
    if(arr[i]==s){
        System.out.println("The element found in "+i);
        break;
    }
}
    }
}
