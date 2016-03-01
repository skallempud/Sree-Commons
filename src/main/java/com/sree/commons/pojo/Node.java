package com.sree.commons.pojo;

public class Node {

	private String data;
	public Node previous;
	public Node next;
	
	public Node(String data){
		this.data = data;
		previous = null;
		next = null;
	}
	public Node(Node previous, String data, Node next){
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
	
	public String data(){
		return this.data;
	}
}
