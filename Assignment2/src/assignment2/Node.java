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
public class Node 
{
    private Object element;
	private Node next;

	// Constructors
	public Node(Object e, Node n)
	{
		element = e;
		next = n;
	}
        
        public Node()
        {
            
        }
        
        public Object getElement()
	{	return element;	}
	
	public Node getNext()
	{	return next;	}
	
	// Modifier methods
	public void setElement(Object newElem)
	{
		element = newElem;
	}

	public void setNext(Node newNext)
	{
		next = newNext;
	}

}
