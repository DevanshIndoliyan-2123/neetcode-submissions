class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        if(s.isEmpty() || t.isEmpty() || s.length() < t.length()){
    return "";
}
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int target = t.length();
        int[] window =  {0,Integer.MAX_VALUE};
        int left = 0 ;
        for(int right = 0 ; right < s.length() ; right++){
            char curr = s.charAt(right);
            if(map.containsKey(curr) && map.get(curr) >0 ){
                target--;
            }
            map.put(curr,map.getOrDefault(curr,0)-1);

            //window contains all the character of t 
            if(target==0){
                while(true){
                    char leftChar = s.charAt(left);
                    if(map.containsKey(leftChar) && map.get(leftChar)==0){
                        break;
                    }
                    map.put(leftChar, map.getOrDefault(leftChar,0)+1);
                    left++;
                }

                if(right-left < window[1]-window[0]){
                    window[0]=left;
                    window[1]=right;

                }
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)+1);
                target++;
                left++;
            }

        }
        return window[1] >= s.length() ?"" : s.substring(window[0],window[1]+1); 
    }
}
