package linklist;

public class LinkedList
{
	Node head;
	
	 class Node
	 {
		 int data;
		 Node next;
		 
		 public Node(int data) 
		 {
			 this.data = data;
			 this.next = null;
		 }
	 }
	public  Node insert (int data)
	{
			
			Node newNode = new Node(data);
			if (head == null)
			{
				head = newNode;
			}
			else 
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = newNode;
			}
			return newNode;
	}

		public void print() 
		{
			Node temp = head;
			while(temp!=null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();
		}
		public void insertAfter(Node prevNode, int value)
		{

			if (prevNode == null)
			{
			System.out.println("Previous Node should not be NULL");
			return;
			}
			
			Node newNode = new Node(value);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			}
		public int pop()
		{
			int popData = 0;
			if (head == null) 
			{
			System.out.println("Stack Over Flow");
			}
			popData = head.data;
			head = head.next;
			return popData;
			}
}
