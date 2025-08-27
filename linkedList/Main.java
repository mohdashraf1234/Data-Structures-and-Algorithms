package com.linkedlistt;

public class Main {
	public static void main(String[] args) {
		LL  l=new LL();
		l.insertFirst(10);
		l.insertFirst(20);
		l.insertFirst(30);
		l.insertFirst(40);
		l.insertLast(100);
		l.insert(55,2);
		//l.deleteFirst();
		l.display();
		
		System.out.println("--------");
		l.deleteLast();
		l.display();
		System.out.println("----");
		l.delete(1);
		l.display();
		
		System.out.println("---get-------");
//		l.get(1);
//		l.display();
		
	}
	

}
