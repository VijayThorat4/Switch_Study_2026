import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyClass1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("MyName", "VJ");
		map.put("actor", "Hritik");
		map.put("Hobby", "Travel");
		
//		System.out.println(map);
//		System.out.println(map.get("MyName"));
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {       // Enhanced for loop
		System.out.println(key + " " + map.get(key));
	}
}
}