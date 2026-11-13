class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        inorder(r1, list1);
        inorder(r2, list2);

        int i = 0, j = 0;

        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i).equals(list2.get(j)))
            {
                ans.add(list1.get(i));
                i++;
                j++;
            }
            else if(list1.get(i) < list2.get(j))
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        return ans;
    }

    void inorder(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}