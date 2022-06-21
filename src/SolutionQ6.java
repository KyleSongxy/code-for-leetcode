public class SolutionQ6 {
    public String convert(String s, int numRows) {
        String[] sList = s.split("");
        int group = numRows+numRows-2;
        int groupNum = sList.length/group;
        boolean aliquot = sList.length % group == 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int j=0;j<numRows+numRows-2;j++) {
            for (int i=0;i<groupNum;i++){
                System.out.println(i * (numRows + numRows - 2)+j);
                stringBuilder.append(sList[(i * (numRows + numRows - 2)+j)]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        SolutionQ6 solutionQ6 = new SolutionQ6();
        System.out.println(solutionQ6.convert(str,3));
    }
}
