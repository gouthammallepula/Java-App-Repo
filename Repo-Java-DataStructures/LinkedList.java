package dataStructures;

public class LinkedList {
    //structure of the node
	Node head; //starting point of the list
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//method to print the data in the list
	public void printList() {
		Node n = head;
		while(n!= null) {
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	//pushing a new node at front
	public void push(int newdata) {
		//allocate the nodes and put in the data
		Node newdat = new Node(newdata);
		//make new node as head
		newdat.next = head;
		//move the head to point to the new node
		head = newdat;
		return; 
	}
	
	//insert at anywhere except ends i.e middle
	public void insertAfter(Node prev,int newdata) {
		//check if previous node is null
		if(prev == null) {
			System.out.println("previous node doesn't exist");
			return;
		}
		// assign the data to new node
		Node newnode = new Node(newdata);
		//change new node address to previous node after address
		newnode.next = prev.next;
		//now give previous node next to new node
		prev.next = newnode;
		return;
	}
	
	//inserting at end
	public void append(int newdata) {
		//create a new node
		Node newnode = new Node(newdata);
		//check if list is empty
		if(head == null) {
			head = newnode;
			return;
		}
		
		//since we are appending the new node to end make the next as null
		newnode.next = null;
		//traverse to the end of the list
		Node last = head;
		while(last.next != null)
			last = last.next;
		//now we reached last
		last.next = newnode;
		return;
	}
	
	//main method
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next = third;
		list.push(8);//pushing it to front
		list.insertAfter(second, 5);//pushing between 2 & 3
		list.append(6);//push to last
		list.printList();
	}
}
