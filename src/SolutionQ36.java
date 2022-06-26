import java.util.ArrayList;

public class SolutionQ36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0;i<9;i++){
            char[] tmp = board[i];
            ArrayList<Character> has = new ArrayList<>();
            for (int j=0;j<9;j++){
                if (tmp[j]!='.') {
                    if (has.contains(tmp[j])) {
                        return false;
                    } else has.add(tmp[j]);
                }
            }
        }
        for (int i=0;i<9;i++){
            ArrayList<Character> has = new ArrayList<>();
            for (int j=0;j<9;j++){
                if (board[j][i]!='.') {
                    if (has.contains(board[j][i])) {
                        return false;
                    } else {
                        has.add(board[j][i]);
                    }
                }
            }
        }
        for (int i=0;i<9;i+=3){
            for (int j=0;j<9;j+=3){
                ArrayList<Character> has = new ArrayList<>();
                for (int k=0;k<3;k++){
                    for (int l=0;l<3;l++){
                        if (board[i+k][j+l]!='.') {
                            if (has.contains(board[i + k][j + l])) {
                                return false;
                            } else {
                                has.add(board[i + k][j + l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
