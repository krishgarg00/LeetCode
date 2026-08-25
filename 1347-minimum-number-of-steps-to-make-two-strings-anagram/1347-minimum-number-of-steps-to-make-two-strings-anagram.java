class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        int sum=0;
        for(int i : arr){
            sum+=Math.abs(i);
        }
        return sum/2;
    }
}