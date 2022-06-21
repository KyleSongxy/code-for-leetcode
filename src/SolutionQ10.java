import java.util.ArrayList;

public class SolutionQ10 {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()){
            return text.isEmpty();
        }
        boolean first = !text.isEmpty() && text.charAt(0)==pattern.charAt(0) || pattern.charAt(0)=='.';
        if (pattern.length()>2 && pattern.charAt(1)=='*'){
            return isMatch(text,pattern.substring(2)) || isMatch(text.substring(1),pattern) || isMatch(text.substring(1),pattern.substring(1));
        }
        else {
            return first && isMatch(text.substring(1),pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        SolutionQ10 solutionQ10 = new SolutionQ10();
        System.out.println(solutionQ10.isMatch(s,p));
    }
}
