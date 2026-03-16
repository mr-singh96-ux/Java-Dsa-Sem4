//Frequent k elemets
import java.util.*;

public class q6{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());

        LinkedHashMap<Integer, Integer> sortMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> e : list){
            sortMap.put(e.getKey(), e.getValue());
        }
        int k = 2;

        for(int i=0;i<Math.min(k,list.size()); i++){
            System.out.println(list.get(i).getKey());
        }
        System.out.println(sortMap);
    }
}