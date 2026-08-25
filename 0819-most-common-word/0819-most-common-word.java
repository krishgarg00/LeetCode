class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z ]"," ");
        String[] arr = paragraph.split("\\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int max=0;
        String ans="";
        for(String s : map.keySet()){
            if(map.get(s)>max){
                ans=s;
                max=map.get(s);
            }
        }
        return ans;
    }
}