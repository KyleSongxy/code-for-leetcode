public class SolutionQ8 {
    public int myAtoi(String s) {
        boolean symbol = true;
        s = s.trim();
        if (s.equals("")){
            return 0;
        }
        Character character = s.charAt(0);
        if (character.equals('-')){
            symbol = false;
        }
        int i;
        if(Character.isDigit(character)){
            i = 0;
        }
        else if (character.equals('+')||character.equals('-')){
            i = 1;
        }
        else {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j=i;j<s.length();j++){
            if (Character.isDigit(s.charAt(j))){
                stringBuilder.append(s.charAt(j));
            }
            else {
                break;
            }
        }
        int result;
        String resultS = stringBuilder.toString();
        if (resultS.equals("")){
            return 0;
        }
        if (resultS.equals("2147483647")){
            if (symbol){
                return 2147483647;
            }
            else {
                return -2147483647;
            }
        }
        try {
            result = Integer.parseInt(resultS);
        }
        catch (NumberFormatException e){
            result = (int)Math.pow(2,31);
        }
        if (symbol){
            return result;
        }
        else {
            if (result==(int)Math.pow(2,31)) {
                return -(result + 1);
            }
            else {
                return -result;
            }
        }
    }

    public static void main(String[] args) {
        String s = "-2147483647";
        SolutionQ8 solutionQ8 = new SolutionQ8();
        System.out.println(solutionQ8.myAtoi(s));
        System.out.println((int)Math.pow(2,31));
    }
}
