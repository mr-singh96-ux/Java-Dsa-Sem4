public class Palindrome{
    static int revese(int num, int rev){
        if(num == 0) return rev;
        return revese(num/10, rev*10+num%10);
    }
    static boolean pal(int num){
        return num == revese(num,0);
    }
    public static void main(String[] args) {
        System.out.println(pal(122));
    }
}