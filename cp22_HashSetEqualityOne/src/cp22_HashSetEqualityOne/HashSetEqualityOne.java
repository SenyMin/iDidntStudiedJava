package cp22_HashSetEqualityOne;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber
{
	int num;
	public SimpleNumber(int i)
	{
		num = i;
	}
	public String toString()
	{
		return String.valueOf(num);
	}
	public int hashCode()
	{
		return num%3;
	}
	public boolean equals(Object obj)
	{
		SimpleNumber comp =  (SimpleNumber) obj;
		if(comp.num == num)
			return true;
		else
			return false;
	}
}

public class HashSetEqualityOne {
	public static void main(String [] args)
	{
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(30));
		
		System.out.println("저장된 데이터 수 : "+ hSet.size());
		
		Iterator <SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
