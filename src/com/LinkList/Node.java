package com.LinkList;

public class Node {

	private Node nextNode;
	private Object data;
	
	
	public Node(Object data){ this.data = data;}
	public Node(Object data, Node nextNode){ this.data=data;this.nextNode=nextNode;}
	public Object getData(){return data;}
	public void setData(Object data){this.data=data;}
	public Node getNextNode(){return nextNode;}
	public void setNextNode(Node nextNode){this.nextNode=nextNode;}

}
