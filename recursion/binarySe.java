//Binary Search
public class binarySe{
    static int search(int[] arr, int key, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
            
            if(key==arr[mid])
                return mid;
            else if(key > arr[mid])
                return search(arr, key, mid+1, end);
            else
                return search(arr, key, start, mid-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 6, 0, arr.length-1));
    }
}