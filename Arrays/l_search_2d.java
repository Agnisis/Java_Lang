import java.util.*;

public class l_search_2d{

public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row and col of array");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] arr= new int[row][col];
    System.out.println("Enter the elements");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    System.out.println("enter the element to be searched ");
int s=sc.nextInt();
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        if(arr[i][j]==s){
            System.out.println("Element found at "+i+","+j);
            break;
        }
    }
}
}
}