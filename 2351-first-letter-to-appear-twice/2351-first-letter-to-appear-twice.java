class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char ch = 'a';
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return ch;
    }
}