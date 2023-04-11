import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class User {

	
	public static void main(String[] args) {
		/*List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		System.out.println(li);
		Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			li.add(3);
			Integer i = it.next();
			System.out.println(i);
		}*/
		List<String> li =new ArrayList<>();
		li.add("B");
		li.add("A");
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li, Comparator.reverseOrder());
		System.out.println(li);
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}
}
