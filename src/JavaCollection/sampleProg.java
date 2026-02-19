package JavaCollection;

import java.util.*;

public class sampleProg {

	public static void main(String[] args) {
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");  // Duplicate
		    cars.add("Mazda");
		    System.out.println(cars);
		    System.out.println("---------**********----------");
		    ArrayList<String> cars1 = new ArrayList<String>();
		    cars1.add("Volvo");
		    cars1.add("BMW");
		    cars1.add("Ford");
		    cars1.add("Mazda");
		    System.out.println(cars1);
		    cars1.set(1, "TATA");
		    System.out.println(cars1);
		    cars1.add(0, "Suzuki");
		    System.out.println(cars1);
		    System.out.println(cars1.get(3));
		    for(int i=0;i<cars1.size();i++) {
		    	System.out.println(cars1.get(i));
		    }
		    for(String i:cars1) {
		    	System.out.println(i);
		    }
		    Collections.sort(cars1);
		    System.out.println(cars1);
		    System.out.println(cars1.contains("TATA"));
	}

}
