public class tryCatch {
    static void fun() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (NullPointerException errr) {
            System.out.println(errr.toString());
            System.out.println("Caught in main.");
        }
    }
    
}
