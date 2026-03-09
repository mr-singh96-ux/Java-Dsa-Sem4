public class tryCatch{
    public static void main(String[] args) {
        try{
            int a = 10/0;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]); 
        }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array out of bound");
        // }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}