public class evenOdd{
    public static void main(String[] args) {
        int n = 8;
        if((n&1) == 1) System.out.println("Odd");
        if((n&1) == 0) System.out.println("Even");
    }
}