
public class LocationQueue 
{
		FirstLastList theList;

		//--------------------------------------------------------------
		public LocationQueue()                // constructor
		{ 
			theList = new FirstLastList(); 
		}  // make a 2-ended list
		//--------------------------------------------------------------
		public boolean isEmpty()          // true if queue is empty
		{ 
			return theList.isEmpty(); 
		}
		//--------------------------------------------------------------
		public void insert(long j)        // insert, rear of queue
		{ 
			theList.insertLast(j); 
		}
		//--------------------------------------------------------------
		public Link remove()              // remove, front of queue
		{  
			return theList.deleteFirst();  
		}
		//--------------------------------------------------------------
		public void displayQueue()
		{
			System.out.print("Queue (front-->rear): ");
			theList.displayList();
		}
		//--------------------------------------------------------------
		public void append(LocationQueue list2)  // appending a Queue
		{
			Link current = list2.theList.first;
			while(current != null)
			{
				insert(list2.remove().iData);       // inserting by rear
				current = current.next;
			}

		}
	}  // end class LinkQueue
	////////////////////////////////////////////////////////////////

