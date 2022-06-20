public class SolutionQ7 {
    public int reverse(int x) {
        boolean neg = false;
        if (x<0){
            x = Math.abs(x);
            neg = true;
        }
        String xList = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xList);
        stringBuilder.reverse();
        try {
            int result = Integer.parseInt(stringBuilder.toString());
            if (neg){
                return -result;
            }
            else {
                return result;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 1534236469;
        SolutionQ7 solutionQ7 = new SolutionQ7();
        System.out.println(solutionQ7.reverse(x));
    }
}
