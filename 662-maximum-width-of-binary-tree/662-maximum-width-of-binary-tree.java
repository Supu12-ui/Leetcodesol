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

// class Pair{
//     TreeNode node;
//     int level;
//     Pair(TreeNode _node, int _level) {
//         node = _node;
//         level = _level;
//     }
// }
// class Solution {
//     public int widthOfBinaryTree(TreeNode root) {
//         Queue<Pair> queue = new LinkedList<>();
//         int ans = 0;
//         if(root == null) return ans;
//         queue.offer(new Pair(root, 0));
        
//         while(! queue.isEmpty()) {
//             int size = queue.size();
//             int min = queue.peek().level;
//             int first = 0, last = 0;
//             for( int i = 0; i < size; i++) {
//                 Pair it = queue.poll();
//                 TreeNode node = it.node;
//                 int cur_id = it.level - min;
				
//                 if(i == 0) first = cur_id; // first position
//                 if(i == size-1) last = cur_id; // last position
                
//                 if(node.left != null) queue.offer(new Pair(node.left, cur_id*2 + 1)); // 2*i+1
//                 if(node.right != null) queue.offer(new Pair(node.right, cur_id*2 + 2)); // 2*i+2
//             }
            
//             ans = Math.max(ans, last-first+1); // max width
//         }
//         return ans;
//     }
// }
class pair
{
    
    TreeNode node;
    int num;
   pair(TreeNode _node,int _num)
    {
        node=_node;
        num=_num;
        
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int max=0;
    
        while(!q.isEmpty())
        {
            int size=q.size();
            int mnum=q.peek().num;
            int first=0,last=0;
            for(int i=0;i<size;i++)
            {
                 pair temp1= q.poll();
                TreeNode temp=temp1.node; 
                int cur=temp1.num-mnum;
             
               // System.out.print(temp.val);
               
                if(i==0)
                {
                    first=cur;
                }
                if(i==size-1)
                {
                    last=cur;
                }
                if(temp.left!=null)
                {
                    q.add(new pair(temp.left,(2*cur)+1));
                }
                if(temp.right!=null)
                {
                    q.add(new pair(temp.right,(2*cur)+2));
                }
                
            }
            max=Math.max((last-first+1),max);
        }
        return max;
        
        
    }
}