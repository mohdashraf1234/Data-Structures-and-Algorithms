package com.linkedlistt;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	// Insert at the beginning
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}
	
	// Insert at the end
	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	// Insert at any index
	public void insert(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size) {
			insertLast(val);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(val, temp.next);
		temp.next = node;

		size++;
	}
	
	// Delete from beginning
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return value;
	}

	// Delete from end
	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node secondLast = get(size - 2);
		int value = tail.value;

		tail = secondLast;
		tail.next = null;
		size--;

		return value;
	}

	// ✅ Delete from a given index
	public int delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}

		Node prev = get(index - 1); // Node before the one to delete
		int value = prev.next.value;

		// Skip the node at "index"
		prev.next = prev.next.next;

		size--;
		return value;  // Return deleted node value
	}

	// Helper: get node at index
	private Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
	
	// Display Linked List
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ---> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

	// Node class
	public class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;			
		}
	}
}
