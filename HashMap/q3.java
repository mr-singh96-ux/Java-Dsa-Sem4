//Two sum problem

import java.util.HashMap;

public class q3{
    public static void main(String[] args) {
        int[] arr = {11,7,2,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                return;
            }

            map.put(arr[i],i);
        }

        System.out.println(map);
    }
}