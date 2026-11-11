class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(mpp.containsKey(arr[i]))
            {
                if(Math.abs(mpp.get(arr[i])-i)<=k) return true;
            }
            
            mpp.put(arr[i],i);
            
            
        }
        
        return false;
        
        
        
        
        
    }
}