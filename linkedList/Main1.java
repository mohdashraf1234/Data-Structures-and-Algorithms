package com.linkedlistt;

public class Main1 {
	public static void main(String[] args) {
      DLL list = new DLL();
      list.insertFirst(3);
      list.insertFirst(2);
      list.insertFirst(8);
      list.insertFirst(17);
      list.insertLast(99);
      list.insert(8, 65);

      list.display();
      
      
//    CLL list = new CLL();
//    list.insert(23);
//    list.insert(3);
//    list.insert(19);
//    list.insert(75);
//    list.display();
//    list.delete(19);
//    list.display();
	}

}
