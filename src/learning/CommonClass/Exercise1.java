package learning.CommonClass;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String res = reverse(str,1,5);
        System.out.println(res);
    }

    public static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        int s = start;
        int e = end;
        char c;
        while (s < e) {
            c = chars[s];
            chars[s] = chars[e];
            chars[e] = c;
            s++;
            e--;
        }
        return String.valueOf(chars);
    }
}
