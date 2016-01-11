import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("세니",26));
		hSet.add(new Person("주이",23));
		hSet.add(new Person("이진호",20));
		hSet.add(new Person("이진호",10));
		hSet.add(new Person("이진호",10));
		hSet.add(new Person("세니",26));
		
		System.out.println("저장된 데이터 수 : "+hSet.size());
		
		Iterator<Person> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
