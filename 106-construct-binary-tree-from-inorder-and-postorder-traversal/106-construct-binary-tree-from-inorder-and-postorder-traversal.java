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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
            
        }
        TreeNode root=cal(postorder,0,postorder.length-1,inorder,0,inorder.length-1,hm);
        return root;
        
        
    }
    public TreeNode cal(int []preorder,int prestart,int preend,int []inorder,int instart,int inend,HashMap<Integer,Integer> hm)
    {
        if(prestart>preend || instart>inend)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[preend]);
        int inroot=hm.get(root.val);
        int numleft=inroot-instart;
        root.left=cal(preorder,prestart,prestart+numleft-1,inorder,instart,inroot-1,hm);
        root.right=cal(preorder,prestart+numleft,preend-1,inorder,inroot+1,inend,hm);
        return root;
        
        
        
        
        
    }
    
}