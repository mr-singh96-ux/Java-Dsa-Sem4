// Count Digits of a Number
public class countDigits{
    static int digits(int num, int count){
        if(num == 0) return 1;
        if(num == 0) return count;
        return digits(num/10, count+1);
    }
    public static void main(String[] args) {
        System.out.println("Number of digits are: "+digits(2, 0));
    }
}