class Solution {
    public ArrayList<Integer> countVowels(String s, int[][] queries) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] prefix = new int[s.length()];
        int cnt = 0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if("aeiou".indexOf(ch)!=-1) cnt++;
            
            prefix[i] = cnt;
            
        }
        
        for(int i=0;i<queries.length;i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];
            
            if(l>0)
            {
                int asn = prefix[r]-prefix[l-1];
                ans.add(asn);
            }
            else
            {
                int asn = prefix[r];
                ans.add(asn);
            }
        }
        
        return ans;
    }
}