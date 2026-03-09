//Second Largest Element
import java.util.*;
public class largest {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(9);
        l1.add(10);
        l1.add(1);

        int lar1 = Integer.MIN_VALUE;
        int lar2 = Integer.MIN_VALUE;

        for(int x : l1){
            if(x > lar1) lar1 = x;
        }

        for (int x : l1) {
            if(x > lar2 && x < lar1) lar2 = x;
        }
        System.out.println(lar2);
    }
}
