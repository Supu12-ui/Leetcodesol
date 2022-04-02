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
class BSTIterator {
    ArrayList<Integer> ans=new ArrayList<>();
   TreeNode node=null;
    int start=0;
     

    public BSTIterator(TreeNode root) {
      node=root;
        inorder(node);
      
        
    }
    
    public int next() {
       
        int val=ans.get(start);
       // System.out.println(ans);
        start++;
        return val;
    }
    
    public boolean hasNext() {
       // System.out.println(start);
        if(start<ans.size())
        {
            return true;
        }
        
        return false;
        
    }
    void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */