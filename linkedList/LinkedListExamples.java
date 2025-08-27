package com.linkedlistt;

public class LinkedListExamples {

    Node head;  // head of list  
    
    // Node class
    static class Node {  
        int data;  
        Node next;  
        Node(int d) {
            data = d;
            next = null;
        }
    }  
    
    // Method to display linked list
    public void display() {
        Node n = head;  
        while (n != null) {  
            System.out.print(n.data + " \n");  
            n = n.next;  
        }
    } 
    
    public static void main(String[] args) {
        /* Start with the empty list. */  
        LinkedListExamples list = new LinkedListExamples();  
          
        list.head = new Node(100);  
        Node second = new Node(200);  
        Node third = new Node(300);  
        Node fourth=new Node(400);
          
        list.head.next = second; // Link first node with the second node  
        second.next = third;     // Link second node with the third node  
        third.next=fourth;
        // Display the list
        list.display();  
    }
}
