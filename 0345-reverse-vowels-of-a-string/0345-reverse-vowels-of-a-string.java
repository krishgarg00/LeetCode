class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !isvowel(arr[start])){
                start++;
            }
            while(end>start && !isvowel(arr[end])){
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String answer = new String(arr);
        return answer;
    }
    private boolean isvowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 
    }
}