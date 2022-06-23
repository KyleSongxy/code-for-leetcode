import java.util.ArrayList;

public class SolutionQ20 {
    public boolean isValid(String s) {
        ArrayList<Character> left = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                left.add(s.charAt(i));
            }
            else {
                if (left.size()>0) {
                    if ((left.get(left.size() - 1) == '(' && s.charAt(i) == ')') ||
                            (left.get(left.size() - 1) == '{' && s.charAt(i) == '}') ||
                            (left.get(left.size() - 1) == '[' && s.charAt(i) == ']')) {
                        left.remove(left.size() - 1);
                    } else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return left.size() == 0;
    }
}
