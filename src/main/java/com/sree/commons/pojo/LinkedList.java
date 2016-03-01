package com.sree.commons.pojo;

public class LinkedList {

	private Node head;
	private Node tail;
	
	public LinkedList(){
		this.tail = new Node("second", null);
		this.head = new Node("first", head);
	}
	
	public static void main(String[] args){
		new LinkedList();
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
