class Solution {
    public void sortIt(int[] arr) {
        // code here
        
        ArrayList<Integer> listO = new ArrayList<>();
        ArrayList<Integer> listE = new ArrayList<>();
        
        for(int x : arr)
        {
            if(x%2==0) listE.add(x);
            else listO.add(x);
        }
        
        Collections.sort(listO);
        Collections.sort(listE);
        
        int n = arr.length;
        
        int i = 0;
        int idxO = listO.size()-1;
        int idxE = 0;
        
        while(idxO>=0)
        {
            arr[i++] = listO.get(idxO--);
        }
        
        while(idxE<listE.size())
        {
            arr[i++] = listE.get(idxE++);
        }
    }
}
