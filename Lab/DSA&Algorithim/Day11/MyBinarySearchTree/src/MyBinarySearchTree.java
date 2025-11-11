

public class MyBinarySearchTree {
    Node root;
    class Node{
    	int data;
    	Node left;
    	Node right;
		public Node(int data){
			
		
			
			this.data = data;
			this.left = null;
			this.right = null;
		}
    	
    }
    
    public MyBinarySearchTree() {
    	root =null;
    }
		
    public void insertNode(int key) {
    	root = insertData(root,key);
    }
    private Node insertData(Node root,int key) {
    	Node newNode = new Node (key);
    	//tree is empty,terminating for recursion
    	if(root == null) {
    		root = newNode;
    		return root;
    		
    	}else {
    		if(key<root.data) {
    			root.left = insertData(root.left,key);
    			
    		}else {
    			root.right = insertData(root.right,key);
    		}
    		return root;
    	}
    }
    
    public void inorder() {
    	inorderTraversal(root);
    	System.out.println();
    	
    }
    
    private void inorderTraversal(Node root) {
    if(root!=null) {
    	inorderTraversal(root.left);
    	System.out.println(root.data+",");
    	inorderTraversal(root.right);
    	
    }
    
    }
    
    public void postorder() {
    	postorderTraversal(root);
    	System.out.println();
    }

	private void postorderTraversal(MyBinarySearchTree.Node root2) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data+",");
		}
		
	}
	
	public void preorder() {
    	preorderTraversal(root);
    	System.out.println();
    }

	private void preorderTraversal(MyBinarySearchTree.Node root2) {
		if(root!=null) {
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			System.out.println(root.data+",");
		}
		
	}
	
	public void deleteNode(int key) {
		root = deleteData(root,key);
		
	}

	private Node deleteData (Node root, int key) {
		if(root ==null) {
			return root;
		}
		// traverse to find node
		if(key<root.data) {
			root.left = deleteData(root.left,key);
		}else if(key>root.data) {
			root.right = deleteData(root.right,key);
		}else {
			//found node to delete 1.node is leaf node
			if(root.left == null && root.right == null) {
			return null;	
			}
			
			//2.node has 1 child
			else if (root.left == null) {
				return root.right;
				
			}else if(root.right == null) {
				return root.left;
			}
			
			//the node has 2 children 
			root.data =minvalue(root.right);
			root.right = deleteData(root.right,root.data);
			
		}
		return root;
		
		//
	}
	
	private int minvalue(Node root) {
	int min = root.data;
	while(root.left!=null) {
	min = root.left.data;
	root = root.left;
		}
		return min;
	
}
	public boolean search(int key) {
	return searchBinaryTree(root,key);
}
    
	private boolean searchBinaryTree(Node root, int key) {
		if(root!=null) {
			if(root.data == key) {
				System.out.println(key + "data found");
				return true;
				
			}else if(key<root.data) {
				return  searchBinaryTree(root.left,key);
				
			}else {
				return  searchBinaryTree(root.right,key);
			}
		}
			
		System.out.println(key+"Data is not found");	
		return false;
	}	
}
    	
  
	