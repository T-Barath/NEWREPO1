package com.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetitiveWords {

	public static void main(String[] args) {
		String s = "Repetitive words as Java words Appication";
		String[] allWords = s.split(" ");
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for (String words : allWords) {
			if (m.containsKey(words)) {
				Integer value = m.get(words);
				m.put(words, value+1);
			}else {
				m.put(words, 1);
			}		
		}
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}

}
