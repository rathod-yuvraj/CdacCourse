
public class Stack {

	 Node  top;
	 
	 class Node
	 {
		 int data ;
		 Node next;
		 Node (int data)
		 {
			 this.data = data;
			 this.next = null;
			 
		 }
		
		 
	 }
	 
	 public Stack () {
		 top = null;
		 
	 }
	 
	 public void push (int data) {
		 
		 Node newNode = new Node(data);
		 if (!isEmpty()) {
			 newNode.next = top;
			 
		 }
		 top=newNode;
		 System.out.println("fgdfgfhg"+ data);
	 }

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
