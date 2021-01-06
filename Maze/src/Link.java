/*********************************************************************
 * New York Institute of Technology  
 * Martin Dove, Elis Cucka, Dibakar Banik
 * Data Structures - CSCI 260 M05 
 * Spring 2019 Semester                 
 * Assignment 5_2: Linked Lists
 * Goal: Working with LinkQueue and Linked Lists.
 * Instructor's name: Michael Kadri    
 * Date of program's creation:      
 * February 20, 2019     Version 0.13 
 ********************************************************************/

////////////////////////////////////////////////////////////////////
public class Link
{
	public long iData;             // data item 
	public Link next;              // next link in list
	public Link prev;
	// -------------------------------------------------------------
	public Link(long id) // constructor
	{
		iData = id;                 // initialize data
		// ('next' is automatically
	}                           //  set to null)
	// -------------------------------------------------------------
	public void displayLink()      // display ourself
	{
		System.out.print("{" + iData  + "} ");
	}
}  // end class Link
/////////////////////////////////////////////////////////////////////