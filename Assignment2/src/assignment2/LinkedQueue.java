/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author k00223375
 */
public class LinkedQueue 
{
    private Node head, tail;
	private int qSize;

	// constructor
	public LinkedQueue( )
	{
		head = tail = null;
		qSize = 0;
	}


	// accessor methods
    	public int size( ) 
	{
		return qSize;
	}    	

        public Node getTail( ) 
	{
		return tail;
	}

	public boolean isEmpty( )
	{
		return (qSize == 0);
	}

        public String front( )     		
	{
		if (isEmpty())
			System.out.println("Queue is Empty");
		else
			return head.getElement();
                return head.getElement();
	}

        public void append (Employee empl) // insert an element 
	{
		Node node = new Node();
		node.setElement(empl);
		node.setNext(null);     	// node will be new tail node
		if (qSize == 0)
			head = node;      	// special case of  a previously 					// empty queue
		else
			tail.setNext(node); // add node at the tail of the list
		
		tail = node;    // update the reference to the tail node
		qSize++;
	}
        
        public String serve( ) 
	// Remove the first object from the queue
	{
		String temp="";
		if (qSize == 0)
		 System.out.println("Queue is empty.");
		else {
			temp = head.getElement();
			head = head.getNext();
			qSize--;
		}
		if (qSize == 0)
                {
			tail = null;
                }   
		return temp;	
	  }
        
        public boolean searchQueue(String lastName)
    {
        Node tempPtr = head;
        while (tempPtr != null) 
        {
            if(tempPtr.getElement().contains(lastName))
            {
                return true;
            }
            else
            {
               tempPtr=tempPtr.getNext();
            }
        }
        return false;
    }

        
    public String printQueue() {

        Node pTemp = head;
        String tempInfo = "";
        while (pTemp != null) {
            tempInfo += pTemp.getElement() + "\n";

            pTemp = pTemp.getNext();
        }
        return tempInfo;
    }    

}
