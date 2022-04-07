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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        int sum=0;
        TreeNode cur=root;
        while(pq.size()!=0)
        {
            int size=pq.size();
             sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=pq.poll();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    pq.add(temp.left);
                }
                if(temp.right!=null)
                {
                    pq.add(temp.right);
                }
                
            }
        }
        return sum;
        
        
        
    }
}