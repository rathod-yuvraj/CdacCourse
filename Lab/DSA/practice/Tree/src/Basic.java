import com.demo.b.Node;

public class Basic {
	
 public	class Node{
		int data;
		Node left,right;
	public Node(int data){
			this.data=data;
			}
	}

 void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data+" --");
			inorder(root.right);
		}
		
		
	}
	

void preorder(Node root) {
	if(root!=null) {
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
}
void postorder(Node root) {
	if(root!=null) {
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data+" ");
	}

	
}

 public int height(Node root) {
	if(root==null) {
		return -1;
		
	}
	Math.max(height(root.left), height(root.right));
	return 0;
}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
	}
}
