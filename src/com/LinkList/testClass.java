package com.LinkList;

public class testClass {

	public static void main(String[] args) {
		LinkedList lnklist = new LinkedList();
		lnklist.add("naren");
		lnklist.add("manish");
		lnklist.add("ram");
		System.out.println("Number Of Nodes in the List: " + lnklist.size());
		
		lnklist.add("naren1", 1);
		lnklist.add("manish1", 3);
		lnklist.add("ram1", 5);
		System.out.println("Number Of Nodes in the List: " + lnklist.size());
		
		System.out.println("All the Nodes available in the List : ");
		DisplayList(lnklist);
		
		lnklist.remove(1);lnklist.remove(3);lnklist.remove(6);
		System.out.println("Number Of Nodes in the List: " + lnklist.size());
		System.out.println("All the Nodes available in the List : ");
		DisplayList(lnklist);
		
	}
	
	public static void DisplayList(LinkedList ll){
		
		for(int i=1; i<=ll.size(); i++){
			System.out.println(i + " : " + ll.get(i).getData());
		}
	}

}
