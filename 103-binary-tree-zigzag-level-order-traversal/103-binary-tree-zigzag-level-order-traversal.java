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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        TreeNode cur=root;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> pq=new LinkedList<>();
         boolean flag=false;
        pq.add(root);
        while(pq.size()>0)
        {
           
            int size=pq.size();
           List<Integer> ar=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=pq.peek();
                pq.remove();
                if(temp.left!=null)
                {
                    pq.add(temp.left);
                }
                if(temp.right!=null)
                {
                    pq.add(temp.right);
                }
                ar.add(temp.val);
            }
            if(flag==true)
            {
                Collections.reverse(ar);
                System.out.println(ar);
                ans.add(ar);
            }
            else
            {
                ans.add(ar);
            }
            flag=!flag;
        }
        return ans;
        
    }
}