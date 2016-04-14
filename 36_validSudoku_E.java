public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        return rowAndCol(board) && subBlocks(board);
        
    }
    public boolean rowAndCol(char[][] board) {
        //  col
        for(int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                else if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        //  row
        for(int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<Character>();
            for(int i = 0; i < 9; i++) {
                if(board[i][j] == '.') continue;
                else if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        
        return true;
    }
    
    public boolean subBlocks(char[][] board) {
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                Set<Character> set = new HashSet<Character>();
                for(int k = 0; k < 3; k++) {
                    for(int l = 0; l < 3; l++) {
                        if(board[i*3 + k][j*3 + l] == '.') continue;
                        else if(set.contains(board[i*3 + k][j*3 + l])) return false;
                        else set.add(board[i*3 + k][j*3 + l]);
                    }
                }
            }
        }
        
        return true;
        
    }
    
}