public class throwTry {
    public static void main(String[] args) {
        try{
            int a = 16;
            if(a<18){
                throw new Exception("Not eligible");
            }
            System.out.println("Eligible");
        }
        catch(Exception e){
                System.out.println(e.getMessage());
            }
            
    }
    
}
