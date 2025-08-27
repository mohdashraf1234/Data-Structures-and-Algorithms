package com.linkedlistt;

public class SinglyLinkedList {

	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	//represent nodeand tail
	public Node  head=null;
	public Node tail=null;
	
	//add node
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		//If list is empty, both head and tail will point to new node   
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
		
		public void display()
		{
			Node current=head;
			if(head==null)
			{
				//empty
				return;
			}
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
				
			}
			 System.out.println();    
			
			
		}
		public static void main(String[] args) {
			SinglyLinkedList s=new SinglyLinkedList();
			s.addNode(10);
			s.addNode(20);
			s.addNode(30);
			s.addNode(40);
			s.addNode(50);
			s.display();
			
		}
		
	}


