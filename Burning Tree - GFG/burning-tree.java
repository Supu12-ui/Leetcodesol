// { Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    public static Node cal(Node root,HashMap<Node,Node> hm,int start)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node res=null;
        while(q.size()!=0)
        {
            Node temp=q.poll();
            if(temp.data==start)
            {
                res=temp;
            }
            if(temp.left!=null)
            {
                q.add(temp.left);
                hm.put(temp.left,temp);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
                hm.put(temp.right,temp);
            }
            
        }
        //System.out.println(res);
        return res;
    }
   
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        
        HashMap<Node,Node> hm=new HashMap<>();
        Node tar=cal(root,hm,target);
        Queue<Node> q=new LinkedList<>();
        HashMap<Node,Boolean> vist=new HashMap<>();
        q.add(tar);
       
        vist.put(tar,true);
        int dist=0;
        while(q.size()!=0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
             Node temp=q.poll();
             if(temp.left!=null && !vist.containsKey(temp.left))
             {
                 q.add(temp.left);
                 vist.put(temp.left,true);
             }
             if(temp.right!=null && !vist.containsKey(temp.right))
             {
                 q.add(temp.right);
                 vist.put(temp.right,true);
             }
             Node check=hm.get(temp);
             if(check!=null && !vist.containsKey(check))
             {
                q.add(check);
                vist.put(check,true);
             }
            }
            dist++;
        }
       return dist-1; 
    }
}