package org.sample;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
	public static void main(String[] args) { 
		Map<Integer, String> s=new HashMap<>();
		s.put(1, "java");
		s.put(2, "selenium");
		s.put(3, "maven");
		Set<java.util.Map.Entry<Integer, String>> a = s.entrySet();
		for (java.util.Map.Entry<Integer, String> entry : a) {
			System.out.println(entry);
			
		}
		for (java.util.Map.Entry<Integer, String> entry : a) {
			System.out.println("keys:\n"+entry.getKey());
			
		}
		Collection<String> values = s.values();
		for (String string : values) {
			System.out.println(string);
			
		}
		Set<Integer> keySet = s.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		
	}

} 
