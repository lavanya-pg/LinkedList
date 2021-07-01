package linklist;

public class LinkedList
{
	Node head;
	Node tail;
	
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
		public int poplast()
		{
			if (head == null) 
	        {
	            System.out.println("Empty");
	        } 
	        else if (head.next == null) 
	        {
	            head = null;
	        }
	        else
	        {
	            Node n = head;
	            Node n1 = head;
	            while (n.next != null)
	            {
	                n1 = n;
	                n = n.next;
	            }
	            n1.next = null;
	        }
			return 0;
	    }
}
