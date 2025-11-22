package com.yuvraj.bst;

public class MyTree {
	Node root;
	class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
		
	}
	public MyTree() {
		
		this.root = null;
	}
	public void insert(int key) {
		root=insertData(root,key);
	}
	private Node insertData(Node root, int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root=newNode;
			return root;
			
		} else if(key<root.data) {
			
			root.left=insertData(root.left,key );
			
		}
				else if(key<root.data) {
							
				root.right=insertData(root.right,key );
							
						}
		
		return root;
	}
	public void inorder() {
		InorderTraversal(root);
		System.out.println();
	}
	private void InorderTraversal(Node root) {
		
		if(root==null) {
			return;
		}else {
			InorderTraversal(root.left);
			System.out.println(root.data+ " ");
			InorderTraversal(root.right);
			
		}
	}
	

}
