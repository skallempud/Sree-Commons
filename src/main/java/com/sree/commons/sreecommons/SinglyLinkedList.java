package com.sree.commons.sreecommons;

public class SinglyLinkedList {

	private Node head;
	private Node tail;
	
	public SinglyLinkedList(){
		this.tail = new Node("second", null);
		this.head = new Node("first", head);
	}
	
	public static void main(String[] args){
		new SinglyLinkedList();
	}
	
	public static class Node{
		private Node next;
		private String data;
		
		public Node(String data, Node next){
			this.data = data;
			this.next = next;
		}
	}
}
