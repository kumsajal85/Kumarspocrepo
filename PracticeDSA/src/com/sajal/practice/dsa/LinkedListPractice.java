package com.sajal.practice.dsa;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public class LinkedListPractice {
	
	static void printLL(Node node) {
		while(node.next!=null) {
		System.out.println(node.val+" ");
		node=node.next;
		}
	}
	
	public static void main(String Ar[]) {
		System.out.println("first program!!");
		Node node1=new Node(1);
		node1.next=new Node(2);
		//node1.next.next=null;
		printLL(node1);
	}
	
	 
	

}
