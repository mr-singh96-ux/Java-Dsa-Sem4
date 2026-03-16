//Frequency count
import java.util.*;

public class q1{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,2,2,3,3,3,1,4,5};

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 2){
                System.out.println(e.getKey());
            }
        }
    }
}