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

    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
         insert(root);
       
    }
    
    public int next() {
      // System.out.println(st.pop().val);
        if(st.size()==0)
        {
            return -1;
        }
        TreeNode temp=st.pop();
        System.out.println(temp.val);
        if(temp.right!=null)
        {
           
            insert(temp.right);
        }
        
        return temp.val;
        
    }
    
    public boolean hasNext() {
        //System.out.println(st.pop().val);
        if(st.size()==0)
        {
            return false;
        }
        
        return true;
        
    }
    public void insert(TreeNode root)
    {
        while(root!=null)
        {
            
                st.push(root);
              
                root=root.left;
            
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */