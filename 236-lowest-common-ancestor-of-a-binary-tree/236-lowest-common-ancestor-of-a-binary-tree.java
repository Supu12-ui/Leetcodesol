/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         
        if(root==null)
        {
            return null;
        }
        if(root==p||root==q)
        {
            return root;
        }
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r==null)
        {
            return l;
        }
        else if(l==null && r!=null)
        {
            return r;
        }
        else if(l!=null && r!=null)
        {
            return root;
        }
        else
        {
            return l;
        }
        
        
        
        
        
       
      }
}
//      ArrayList<TreeNode> ans=new ArrayList<>();
//         ArrayList<ArrayList<TreeNode>> myans=new ArrayList<>();
//         cal(root,p,ans,myans);
//         ans=new ArrayList<>();
//         cal(root,q,ans,myans);
//         int i=0,j=0;
//         while(i<myans.get(0).size() && j<myans.get(1).size())
//         {
//             if(myans.get(0).get(i).val!=myans.get(1).get(j).val)
//             {
//                 break;
//             }
//             i++;
//             j++;
//         }
//         return myans.get(0).get(i-1);
//     }
//     boolean cal(TreeNode root,TreeNode p,ArrayList<TreeNode> ans,ArrayList<ArrayList<TreeNode>> myans)
//     {
//         if(root==null)
//         {
//            return false; 
//         }
//         ans.add(root);
//         if(root.val==p.val)
//         {
//             myans.add(new ArrayList<>(ans));
//             return true;
//         }
//         boolean check1=cal(root.left,p,ans,myans);
//         boolean check2=cal(root.right,p,ans,myans);
//         if(check1||check2)
//         {
//             return true;
//         }
//         else
//         {
//             ans.remove(ans.size()-1);
//             return false;
//         }
        
//     }