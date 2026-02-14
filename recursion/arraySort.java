// Check if Array is Sorted
public class arraySort{
    static boolean sortt(int[] arr, int start){
        int end = arr.length-1;
        if(start == end) return true;
        if(arr[start] > arr[start+1]) return false;
        return sortt(arr, start+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sortt(arr, 0));
    }
}