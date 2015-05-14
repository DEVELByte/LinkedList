package com.LinkList;

public class LinkedList {
	private int listCount;
	private Node head;

	public LinkedList() {
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		currentNode.setNextNode(newNode);
		listCount++;
	}

	public void add(Object data, int index) {

		if (index <= listCount && index > 0) {
			Node newNode = new Node(data);
			Node currentNode = head;

			for (int i = 1; i < index; i++) {
				currentNode = currentNode.getNextNode();
			}
			
			newNode.setNextNode(currentNode.getNextNode());
			currentNode.setNextNode(newNode);
			
			listCount++;
		}
	}

	public Node get(int index) {

		if (index > listCount || index <= 0)
			return null;

		Node currentNode = head;
		for (int i = 1; i <= index; i++) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}

	public boolean remove(int index) {
		if (index > listCount || index <= 0)
			return false;

		Node currentNode = head;
		for (int i = 0; i < index - 2; i++) {
			currentNode = currentNode.getNextNode();
		}

		currentNode.setNextNode(currentNode.getNextNode().getNextNode());
		listCount--;
		return true;
	}

	public int size() {
		return listCount;
	}

}
