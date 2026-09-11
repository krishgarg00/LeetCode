class Solution {
    private boolean isSafe(char board[][],int row,int col,int n){
        for(int a=0;a<col;a++){
            if(board[row][a]=='Q'){
                return false;
            }
        }

        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }

        i=row+1;
        j=col-1;
        while(i<n && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }

    private void generate(char board[][],int col,int n,List<List<String>> ans){
        if(col==n){
            ArrayList<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                generate(board,col+1,n,ans);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        generate(board,0,n,ans);
        return ans;
    }
}