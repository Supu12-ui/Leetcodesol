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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> pq=new LinkedList<>();
        
        pq.add(root);
        while(pq.size()!=0)
        {
            int size=pq.size();
            double count=size;
          double avg=0;
            while(size!=0)
            {
                TreeNode temp=pq.remove();
                avg+=temp.val;
               if(temp.left!=null)
               {
                   
                   pq.add(temp.left);
               }
               if(temp.right!=null)
               {
                   pq.add(temp.right);
               }
                
                size--;
            }
            double val=avg/count;
            ans.add(val);
        }
        return ans;
    }
}