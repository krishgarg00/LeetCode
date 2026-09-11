class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){
                    for(int c=1;c<=9;c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=(char)(c+'0');
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int row,int col,int c){
        for(int i=0;i<9;i++){
            if(board[row][i]==(char)(c+'0')){
                return false;
            }
            if(board[i][col]==(char)(c+'0')){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==(char)(c+'0')){
                return false;
            }
        }
        return true;
    }
}