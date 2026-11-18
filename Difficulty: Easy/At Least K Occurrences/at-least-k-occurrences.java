class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int x : arr) {
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);

            if (mpp.get(x) == k) {
                return x;
            }
        }

        return -1;
    }
}