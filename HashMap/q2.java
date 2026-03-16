//First unique character
import java.util.*;
public class q2{
    public static void main(String[] args) {
        String s = "Kiratbir Singh";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}