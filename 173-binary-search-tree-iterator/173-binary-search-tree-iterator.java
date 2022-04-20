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
  ArrayList<Integer> ans;
    int p=0;
    public BSTIterator(TreeNode root) {
        ans=new ArrayList<>();
        inorder(root);
        
       
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
      if(hasNext()==true)
      {
          int val=ans.get(p);
          p++;
          return val;
      }
        return -1;
        
    }
    
    public boolean hasNext() {
        if(p!=ans.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */