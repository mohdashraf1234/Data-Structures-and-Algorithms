package com.linkedlistt;

public class CountNodes {
	
	public class  Node{
		 int data;    
	        Node next;    
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
//represent head  and tails of  SL
	public Node  head=null;
	public Node tail=null;
	public  void  addNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			//emty
			head=newNode;
			tail=newNode;
		}
		else
		{
			 //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;  
		}
		
	}
	public int  countNode()
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
	
		return count;
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
		CountNodes c=new CountNodes();
		c.addNode(10);
		c.addNode(20);
		c.addNode(30);
		c.addNode(40);
		c.addNode(50);
		c.display();
		 //Counts the nodes present in the given list    
        System.out.println("Count of nodes present in the list: " + c.countNode());  
		
		
	}

}
