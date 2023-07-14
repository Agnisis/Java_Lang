import java.util.Scanner;

class array{

    public static void main(String args[]){

        //static
        int [] marks=new int[4];
        marks[0]=90;
        marks[1]=80;
        marks[2]=89;
        marks[3]=90;
        for(int i=0 ;i<4;i++){

            System.out.print(marks[i]+" ");
        }
        System.out.println(" ");



        //runtime
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int size=sc.nextInt();
        int numbers[]=new int[size];


        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt(); 
        }
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]+" ");
        }


        System.out.println("length nof the array is "+numbers.length);
        

    }
}