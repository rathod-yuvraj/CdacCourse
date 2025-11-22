package Singly;

public class BasicSinglylinkLIst {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	public BasicSinglylinkLIst() {
		this.head =null;
	}
	
	//insert at end
	
	public void inserData(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode=head;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newNode;
		}  
	}


public void displayData() {
	
	if(head==null) {
		System.out.println("Linked is empty");
	}
}















	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
