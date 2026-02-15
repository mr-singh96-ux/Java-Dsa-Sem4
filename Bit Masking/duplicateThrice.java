public class duplicateThrice{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2};
        int result = 0;
        for(int i = 0; i<32; i++){
            int sum = 0;
            for(int num : arr){
                if((num & (1<<i))!=0) sum++;
            }
            if(sum%3!=0)
                result |= (1<<i);
        }
        System.out.println(result);
    }
}