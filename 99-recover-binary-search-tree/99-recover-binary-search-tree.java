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
    ArrayList<TreeNode> arr=new ArrayList<>();
    public void recoverTree(TreeNode root) {
        check(root);
        TreeNode prev=arr.get(0);
        TreeNode cur=arr.get(1);
         int i=1;
        while(i<arr.size())
        {
           if(arr.get(i-1).val>arr.get(i).val)
           {
               prev=arr.get(i-1);
              
               break;
           }
            i++;
        }
        int temp=prev.val;
        while(i<arr.size())
        {
            if(arr.get(i-1).val>arr.get(i).val)
            {
                cur=arr.get(i);
            }
            i++;
        }
        System.out.println(cur.val+" "+temp);
        prev.val=cur.val;
        cur.val=temp;
        
    }
    public void check(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        check(root.left);
        arr.add(root);
        check(root.right);
    }
    
}