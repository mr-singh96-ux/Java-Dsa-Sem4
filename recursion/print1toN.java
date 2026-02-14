//Print Numbers from 1 to N
public class print1toN{
    static void print(int n){
        if(n==0) return; 
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(10);
    }
}