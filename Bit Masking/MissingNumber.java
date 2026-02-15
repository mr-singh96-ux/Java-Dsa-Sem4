public class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1; i<=n+1; i++){
            xor1 ^= i;
        }

        for(int i=0; i<n; i++){
            xor2 ^= arr[i];
        }

        int e = xor1 ^ xor2;
        System.out.println(e);
    }
}