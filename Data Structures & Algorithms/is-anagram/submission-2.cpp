class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n= s.length();
        unordered_map<char, int>a;
        unordered_map<char, int>b;
        for(int i = 0 ; i < n ;i++){
            a[s[i]]++;
            b[t[i]]++;
        }
        return a==b;
    }
};
