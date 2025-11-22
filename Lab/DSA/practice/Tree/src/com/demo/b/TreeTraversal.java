package com.demo.b;



public class TreeTraversal{
	//inorder
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
}