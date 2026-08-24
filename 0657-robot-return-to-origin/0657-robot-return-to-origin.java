class Solution {
    public boolean judgeCircle(String moves) {
        int ans1=0;
        int ans2=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                ans1++;
            }
            else if(moves.charAt(i)=='R'){
                ans1--;
            }
            else if(moves.charAt(i)=='U'){
                ans2++;
            }
            else if(moves.charAt(i)=='D'){
                ans2--;
            }
        }
        return ans1==0 && ans2==0;
    }
}