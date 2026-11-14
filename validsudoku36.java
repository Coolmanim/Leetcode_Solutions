import java.util.HashSet;

public class validsudoku36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> done=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<9;j++){
                char now=board[i][j];
                if(now!='.'){
                    if(!done.add(now+" row "+i) || !done.add(now+" column "+j) || !done.add(now+" box "+i/3+j/3)) return false;
                }
            }
        }
        return true;
    }
}
