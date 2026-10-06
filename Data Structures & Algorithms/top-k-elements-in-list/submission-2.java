  public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       //step1. count freq
       for(int num:nums){
        map.put(num, map.getOrDefault(num,0)+1);
       }
       // create bucket
       List<Integer>[] freq= new List[nums.length+1];
       for(int i =0 ; i < freq.length ; i++){
          freq[i]=new ArrayList<>();
       }
       //put the number in the bucket 

       for(int  number  : map.keySet()){
          // int number = entry.getKey();
          int frequency = map.get(number);
          freq[frequency].add(number);
       }
       //get top k elements
       int[] result = new int[k];
       int index = 0 ;
       for(int i = freq.length-1; i>0 ; i--){
        for(int num: freq[i]){
          result[index]=num;
          index++;
          if(index==k){
            return result;
          }
        }
       }
       return result;
    }
}