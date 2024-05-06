package com.appname.collections;

import java.util.LinkedList;

public class LinkedListExample {
	Node head; // Head of linked list
	public static class Node {
		int value;
		Node next;  // link to each node
	public Node(int val) {
			this.value = val;
			this.next  = null;
		}
	}
	public static void main(String[] args) {
		LinkedListExample linkedList = new LinkedListExample();
		linkedList.head = new Node(67);
		Node second = new Node(89);
		Node third = new Node(46);
		linkedList.head.next = second;
		second.next = third;
		System.out.print("LinkedList: ");
		while (linkedList.head != null) {
			System.out.print(linkedList.head.value + " ");
			linkedList.head = linkedList.head.next;
			}
		}
}
