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
		public void searchNode(int data)
		{  
	        Node current = head;  
	        int x = 1;  
	        boolean flag = false;  
	        if(head == null)
	        {  
	            System.out.println("List is empty");  
	        }  
	        else
	        {  
	            while(current != null)
	            {  
	                if(current.data == data)
	                {  
	                    flag = true;  
	                    break;  
	                }  
	                x++;  
	                current = current.next;  
	            }  
	        }  
	        if(flag)  
	             System.out.println("Element is present in the list at the position : " + x);  
	        else  
	             System.out.println("Element is not present in the list");  
	    }
		public void deleteElement(int check)
		{
			int count=0;
	        Node current = head;    
		    while (current != null) 
		    { 
		         if (current.next.data == check) 
		         {
		              current.next=null;
		         }
		         count++;
		         current = current.next; 
		    }  
		  
		}
	 public void printsize()
	 {
		 int count = 3;
		System.out.println("size of list: " +count );
	 }
}
