package com.yuvraj.test;

import com.yuvraj.bst.MyTree;

public class TestTree {

	public static void main(String[] args) {
		MyTree t=new MyTree();
		t.insert(10);
		t.insert(20);
		t.inorder();
	}

}
