// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ar=new ArrayList<>();
	   if(node==null)
	   {
	       return ar;
	   }
	   if(isLeaf(node)==false)
	   {
	       ar.add(node.data);
	   }
	   //Node cur1=node;
	   //Node cur2=node;
	   //Node cur3=node;
	   leftlist(ar,node.left);
	   leaf(ar,node);
	   rightlist(ar,node.right);
	   return ar;
	   
	   
	}
	boolean isLeaf(Node root)
	{
	    if(root.left==null && root.right==null)
	    {
	        return true;
	    }
	    return false;
	}
	void leftlist(ArrayList<Integer> ar,Node root)
	{
	   while(root!=null)
	   {
	       if(isLeaf(root)==false)
	       {
	           ar.add(root.data);
	       }
	       if(root.left!=null)
	       {
	           root=root.left;
	       }
	       else
	       {
	       root=root.right;
	       }
	   }
	   
	}
	void rightlist(ArrayList<Integer> ar,Node root)
	{
	    ArrayList<Integer> temp=new ArrayList<>();
	    while(root!=null)
	    {
	        if(isLeaf(root)==false)
	        {
	            temp.add(root.data);
	        }
	        if(root.right!=null)
	        {
	           root=root.right;
	        }
	        else
	        {
	            root=root.left;
	        }
	    }
	   
	    for(int i=temp.size()-1;i>=0;i--)
	    {
	        ar.add(temp.get(i));
	    }
	}
	void leaf(ArrayList<Integer> ans,Node root)
	{
	    if(isLeaf(root)==true)
	    {
	        ans.add(root.data);
	        return;
	    }
	   if(root.left!=null)
	   {
	    leaf(ans,root.left);
	   }
	   if(root.right!=null)
	   {
	    leaf(ans,root.right);
	   }
	    
	}
}
