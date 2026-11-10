class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int ele : arr)
        {
            if(mpp.containsKey(ele))
            {
                int freq = mpp.get(ele);
                mpp.put(ele,freq+1);
            }
            
            else
            {
                mpp.put(ele,1);
            }
            
            if(mpp.get(ele)==k)
            {
                return ele;
            }
        }
        return -1;
        
    }
}