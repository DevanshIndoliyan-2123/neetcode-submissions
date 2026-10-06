public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Create buckets
        List<Integer>[] arr = new List[nums.length + 1];

        // 3. Create an ArrayList for every bucket
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        // 4. Put numbers into buckets according to their frequency
        for (int num : count.keySet()) {
            int frequency = count.get(num);
            arr[frequency].add(num);
        }

        // 5. Get the top K frequent numbers
        int[] res = new int[k];
        int index = 0;

        // Start from highest frequency
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int num : arr[i]) {

                res[index] = num;
                index++;

                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}