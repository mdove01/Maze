/*********************************************************************
 * New York Institute of Technology  
 * Martin Dove, Elis Cucka, Dibakar Banik,                      
 * Data Structures - CSCI 260 M05 
 * Spring 2019 Semester                 
 * Assignment 5_2: Linked Lists
 * Goal: Working with LinkQueue and Linked Lists.
 * Instructor's name: Michael Kadri    
 * Date of program's creation:      
 * February 20, 2019     Version 0.13 
 ********************************************************************/

public class FirstLastList
{
	Link first;               // ref to first link
	Link last;                // ref to last link
	// -------------------------------------------------------------
	public FirstLastList()            // constructor
	{
		first = null;                  // no links on list yet
		last = null;
	}
	// -------------------------------------------------------------
	public boolean isEmpty()          // true if no links
	{ 
		return first == null; 
	}
	// -------------------------------------------------------------
	public void insertFirst(long dd)  // insert at front of list
	{
		Link newLink = new Link(dd);   // make new link

		if( isEmpty() )                // if empty list,
			last = newLink;             // newLink <-- last
		newLink.next = first;          // newLink --> old first
		first = newLink;               // first --> newLink
	}
	// -------------------------------------------------------------
	public void insertLast(long dd)   // insert at end of list
	{
		Link newLink = new Link(dd);   // make new link
		if( isEmpty() )                // if empty list,
			first = newLink;            // first --> newLink
		else
			last.next = newLink;        // old last --> newLink
		last = newLink;                // newLink <-- last
	}
	// -------------------------------------------------------------
	//public long deleteFirst()         // delete first link
	public Link deleteFirst()         // delete first link
	{         
		Link temp = first;
		if(isEmpty())
			System.out.println("The linked list is empty.");
		else 
		{
			if(first.next == null)         // if only one item
				last = null;                // null <-- last
			first = first.next;            // first --> old next
		}
		return temp;
	}
	// -------------------------------------------------------------
	public void displayList()
	{
		System.out.print("List (first-->last): ");
		Link current = first;          // start at beginning
		while(current != null)         // until end of list,
		{
			current.displayLink();      // print data
			current = current.next;     // move to next link
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
	public void appendLinkList(FirstLastList list2) // appending Linked List
	{
		Link current = list2.first;
		while(current != null)
		{
			insertLast(current.iData);            // inserting by the end of the Linked List
			current = current.next;
		}
	}
	//---------------------------------------------------------------
	// set and get methods for the first element

}  // end class FirstLastList
/////////////////////////////////////////////////////////////////////
