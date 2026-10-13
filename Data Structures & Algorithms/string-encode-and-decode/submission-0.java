class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty() )return "";
        ArrayList<Integer> sizes = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        //size of particular String
        for(String str : strs){
            sizes.add(str.length());
        }

        for(int size : sizes){
            res.append(size).append(',');
        }
        res.append('#');
        for(String str: strs){
            res.append(str);
        }
        return res.toString();

    }

    public List<String> decode(String str) {
        if(str.length() == 0 ){
            return new ArrayList<>();
        }
        List<Integer>size = new ArrayList<>();
        List<String>res = new ArrayList<>();
        int i = 0 ; 
        while(str.charAt(i) != '#'){
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;
        for(int sz : size){
            res.add(str.substring(i, i + sz));
            i = i + sz;
        }
        return res;


    }
}
