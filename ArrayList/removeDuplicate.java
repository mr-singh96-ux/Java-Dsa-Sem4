//Remove Duplicates (Without Using Set)
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(1);
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }

        System.out.println(list1);
    }
}
