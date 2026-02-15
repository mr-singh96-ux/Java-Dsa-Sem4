// a ^ a = 0
// 0 ^ x = x
public class duplicate{
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,4};
        int xor = 0;
        for(int num : arr){
            xor^=num;
        }
        System.out.println(xor);
    }
}