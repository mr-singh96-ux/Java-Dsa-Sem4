// Print All Substrings
public class subString{
    static void string(String s, int start){
        if(start == s.length()) return;
        for(int end = start; end<s.length(); end++){
            System.out.println(s.substring(start,end+1));
        }
        string(s, start+1);
    }
    public static void main(String[] args) {
        string("abc", 0);
    }
}