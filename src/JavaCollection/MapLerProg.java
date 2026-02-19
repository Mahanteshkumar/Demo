package JavaCollection;

import java.util.*;

import org.openqa.selenium.devtools.v141.cachestorage.model.CacheId;

public class MapLerProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("Englind", "London");
		capitalCities.put("India", "New Delli");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("India", "New Delli");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("Norway"));
		System.out.println(capitalCities.size());
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
			System.out.println(capitalCities.get(i));
		}

	}

}
