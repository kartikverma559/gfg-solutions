class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Generate all marks
        for(int i = 0; i < l.length; i++)
        {
            for(int j = l[i]; j <= r[i]; j++)
            {
                list1.add(j);
            }
        }

        // Get marks corresponding to the given ranks
        for(int i = 0; i < rank.length; i++)
        {
            list2.add(list1.get(rank[i] - 1));
        }

        return list2;
    }
}