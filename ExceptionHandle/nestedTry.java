public class nestedTry {
    public static void main(String[] args) {
        try{
            try{
                int a = 10/0;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            try{
                int[] arr = new int[5];
                System.out.println(arr[10]);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println("outer exception");
        }
    }
    
}
