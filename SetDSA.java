package hashSet;
import java.util.HashSet;

import java.util.Iterator;


public class SetDSA 
{
	public static void main(String [] vishalrai)
	{
		// creating the set 
		HashSet<Integer> set=new HashSet<>();
		// insert the element
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); // set only allows uniqice values
		
		/// search contains the values
		if(!set.contains(1));
		{
			System.out.println("set contains 1");
			
		}
		if(!set.contains(6));
		{
			System.out.println ("does not contains six");//set contains 1
			// not contains six..output
		}
		// delete
		set.remove(1);
		{
			System.out.println("does not contain one becoz of we deleted one");
		}
		// size
		System.out.println("size of the set is:"+set.size());
		
		// Iterator
		/*set.add(0);
		Iterator it=new set.isterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ,");
		}*/
		
	}

}
