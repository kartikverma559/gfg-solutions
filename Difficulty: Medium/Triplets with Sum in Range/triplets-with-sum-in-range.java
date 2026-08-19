class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        int cnt=0;
       for(int i = 0; i < arr.length - 2; i++) {
             for(int j = i + 1; j < arr.length - 1; j++) {
                 for(int k = j + 1; k < arr.length; k++) {

                     int sum = arr[i] + arr[j] + arr[k];

                     if(sum >= l && sum <= r) {
                         cnt++;
                     }
                 }
             }
         }
        return cnt;
    }
}