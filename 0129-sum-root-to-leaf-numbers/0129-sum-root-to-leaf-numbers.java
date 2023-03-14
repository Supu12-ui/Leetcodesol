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
    public int sumNumbers(TreeNode root) {
       ArrayList<String> ans=new ArrayList<>();
        rec(root,ans,"");
        System.out.println(ans);
        int sum=0;
        for(int i=0;i<ans.size();i++)
        {
            int num=Integer.parseInt(ans.get(i));
            sum=sum+num;
        }
        return sum;
    }
    public void rec(TreeNode root,ArrayList<String> ans,String temp)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            temp=temp+Integer.toString(root.val);
            ans.add(temp);
            return;
        }
        
        rec(root.left,ans,temp+Integer.toString(root.val));
        rec(root.right,ans,temp+Integer.toString(root.val));
    }
}