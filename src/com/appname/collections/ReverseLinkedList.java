package com.appname.collections;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> Actuallist = new LinkedList<>();
		Actuallist.add(54);
		Actuallist.add(36);
		Actuallist.add(72);
		Actuallist.add(18);
		System.out.println("Actuallist : "+Actuallist);
		// Reverse the linked list
		LinkedList<Integer> Reversedlist = new LinkedList<>();
		Actuallist.descendingIterator().forEachRemaining(Reversedlist::add);
		System.out.println("Reversedlist :" +Reversedlist);
		//Sort the linked list
		Collections.sort(Actuallist);
		System.out.println("Sortedlist : "+ Actuallist);
	}
}
