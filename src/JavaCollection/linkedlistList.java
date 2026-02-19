package JavaCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistList {

	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(5);
		num.add(8);
		num.add(16);
		num.add(77);
		System.out.println(num);
		num.addFirst(3);
		num.addLast(1);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.swap(num, 2, 5);
		System.out.println(num);
		System.out.println(Collections.frequency(num, 1));
	}

}
