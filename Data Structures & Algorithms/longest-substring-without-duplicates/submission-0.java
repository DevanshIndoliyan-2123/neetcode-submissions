class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0,res=0; 
        Map<Character, Integer> map = new HashMap<>(); 
        for( int right = 0 ; right < s.length() ; right++){
            if(map.containsKey(s.charAt(right))){
                l=Math.max(map.get(s.charAt(right))+1,l);
            }   
            map.put(s.charAt(right),right);
            res = Math.max(res,right-l +1);
        }
        return res;
    }
}
