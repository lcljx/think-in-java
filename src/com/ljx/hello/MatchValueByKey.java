package com.ljx.hello;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**模糊匹配查询.
 * @author ASUS
 *
 */
public class MatchValueByKey {

	public static void main(String[] args) {
		Map<String, String> mapping = new HashMap<>();
		final Map<String, Map<String, String>> mapping2 = new HashMap<>();
		mapping.put("nice", "10001");
		mapping.put("bad", "10002");
		mapping.put("sad", "10003");
		mapping2.put("map", mapping);
		Set<String> keys = mapping2.keySet();
		for (String key : keys) {
			Map<String, String> tempMap = mapping2.get(key);
			tempMap.put("666", "555");
		}
		Map<String, String> m = mapping2.get("map");
		 for (String key : mapping.keySet()) {
			 System.out.println(m.get(key));
		 }
//		String result = matchValue(mapping, "nicebadsadgirl");
//		System.out.println(result);
	}
	
	public static String matchValue(final Map<String, String> mapping, String ambigulous) {
		 for (String key : mapping.keySet()) {
			 if (ambigulous.indexOf(key) == -1) {
				 continue;
			 }
			 String value = mapping.get(key);
			 return value;
		 }
		return null;
	}
}
