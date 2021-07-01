package linklist;

public class Node
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Linked List Program");
		
		
		LinkedList linkedList = new LinkedList();
		LinkedList.Node prevNode = linkedList.insert(56);
		linkedList.insertAfter(prevNode, 70);
		linkedList.insertAfter(prevNode, 30);
		
		linkedList.print();

	}

}
