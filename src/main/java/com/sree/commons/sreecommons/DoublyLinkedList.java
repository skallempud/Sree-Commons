package com.sree.commons.sreecommons;

import com.sree.commons.pojo.Node;

public class DoublyLinkedList {

	private Node head;
	private int size;
	
	public DoublyLinkedList(){
		head = null;
		size = 0;
	}
	
	private boolean isEmpty(){
		return head == null;
	}
	
	//head = null data null
	//new = null data head
	//head.previous = new
	//head = new
	
	public void addFront(String data){
		if(head == null){
			head = new Node(null, data, null);
		} else{
			Node newNode = new Node(null, data, head);
			head.previous = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void addRear(String data){
		if(head == null){
			head = new Node(null, data, null);
		} else{
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			Node newNode = new Node(current, data, null);
			current.next = newNode;		
		}
		size++;
	}

	public void insert(String data, int index){
		if(head == null) return;
		if(index < 1 || index > size) return;
		
		Node current = head;
		int i = 1;
		while(i < index){
			current = current.next;
			i++;
		}
		
		if(current.previous == null){
			Node newNode = new Node(null, data, current);
			current.previous = newNode;
			head = newNode;
		} else {
			
			Node newNode =  new Node(current.previous, data, current);
			current.previous.next = newNode;
			current.previous = newNode;
		}
		size++;
	}
	public void print(){
		Node current = head;
		while(current != null){
			System.out.println(current.data());
			current = current.next;
		}
	}
	
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFront("Node1");
		dll.addFront("Node2");
		dll.print();
		System.out.println("--------------");
		dll.addRear("Node3");
		dll.addRear("Node4");
		dll.print();
		System.out.println("--------------");
		dll.insert("Inserted", 2);
		dll.print();
	}
	
}
