/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0)
        {
            List<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                l.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            ans.add(0,l);
        }
//         int start=0;
//         int end=ans.size()-1;
//        while(start<end)
//        {
//             List<Integer> temp= ans.get(start);
//             ans.set(start,ans.get(end));
//             ans.set(end,temp);
//            start++;
//            end--;

//         }
        System.out.println(ans);
        return ans;
        
    }
}