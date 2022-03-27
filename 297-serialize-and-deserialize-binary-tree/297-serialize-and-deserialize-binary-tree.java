/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        {
            return "";
        }
        String str="";
         Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
        while(q.size()!=0)
        {
            TreeNode temp=q.poll();
            if(temp==null)
            {
                str+="n,";
                continue;
            }
            str+=String.valueOf(temp.val)+",";
            q.add(temp.left);
            q.add(temp.right);
            
        }
        System.out.print(str);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)
        {
            return null;
        }
     String val[]=data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode node=new TreeNode(Integer.parseInt(val[0]));
        q.add(node);
        for(int i=1;i<val.length;i++)
        {
            TreeNode temp=q.poll();
            if(!val[i].equals("n"))
            {
              TreeNode left=new TreeNode(Integer.parseInt(val[i]));
                temp.left=left;
                q.add(temp.left);
            }
            i++;
            if(!val[i].equals("n"))
            {
              TreeNode right=new TreeNode(Integer.parseInt(val[i]));
                temp.right=right;
                q.add(temp.right);
            }
        }
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));