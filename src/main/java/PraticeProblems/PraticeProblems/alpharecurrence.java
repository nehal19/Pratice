package PraticeProblems.PraticeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class alpharecurrence {
	
	public static void main(String[] args) {
		
		String que = "a9b2c8";
		Map<String,Integer> charMap = new HashMap<String,Integer>();
 		
		for (int i = 0; i < que.length()-1; i++) {
			char in = que.charAt(i);
			if(Character.isAlphabetic(in)) {
				String a = Character.toString(in);
				Integer b = Integer.valueOf(Character.toString(que.charAt(i+1)));
				charMap.put(a, b);
			}
		}
		Set<String> keySet = charMap.keySet();
		String ans ="";
		for(String key : keySet) {
			for(int i=0 ;i<charMap.get(key);i++) {
				ans+=key;
			}
		}
		System.out.println(ans);
	}
	

}
