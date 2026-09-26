class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0;i < s.length(); i++){
           char c = s.charAt(i);
           int index = c - 'a';
           count[index]++;
        }

        for(int i=0;i < s.length(); i++){
           char c = t.charAt(i);
           int index = c - 'a';
           count[index]--;

           if(count[index]<0){
            return false;
           }
        }
        return true;
    }
}