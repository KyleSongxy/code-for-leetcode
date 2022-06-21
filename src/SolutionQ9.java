public class SolutionQ9 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String xS = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xS);
        return xS.equals(stringBuilder.reverse().toString());
    }
}
