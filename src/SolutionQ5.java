public class SolutionQ5 {
    public static String longestPalindrome(String s) {
        int len = s.length();
        String str = new String();
        boolean[] flag = new boolean[len];
        for(int i = 0 ; i < len ; i++) {
            for(int j = 0 ; j <= i ; j++) {
                flag[j] = (s.charAt(i) == s.charAt(j)) && (i - j < 3 || flag[j + 1]);
                if(flag[j] && i - j + 1 > str.length()) {
                    str = s.substring(j, i + 1);
                }
            }
        }
        return str;
    }
}
