//Rotate List by K Positions
import java.util.*;

public class rotate{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        int k = 2;
        k = k % l1.size();
        
        for(int i = l1.size()-k; i<l1.size(); i++){
            l2.add(l1.get(i));
        }

        for(int i=0; i<l1.size()-k;i++){
            l2.add(l1.get(i));
        }
        System.out.println(l2);
    }
}