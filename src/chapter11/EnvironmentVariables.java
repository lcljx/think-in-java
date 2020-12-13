package chapter11;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariables {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("s", "p");
		System.out.println(map.entrySet());
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
