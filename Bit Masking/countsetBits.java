public class countsetBits{
public static void main(String[] args) {
    int n = 13;
    int count = 0;
    while(n > 0){
        n = n & (n-1);
            count++;
    }
    System.out.println("Number of 1s: " + count);
    
    int cn = Integer.bitCount(13);
    System.out.println(cn);
}
}