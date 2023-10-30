class exception {

    public static void main(String args[]) {
        
                            //   0  1   2   3   4
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        try{
        System.out.println(arr[4]);
        System.out.println("Hello");
        System.out.println(arr[2]);
        System.out.println("Hello");
    }catch(ArrayIndexOutOfBoundsException e )
        {   
            System.out.println("Error:Enter valid size");
           //System.out.println(e.toString());
        }
        // System.out.println(a / b);

    }
}