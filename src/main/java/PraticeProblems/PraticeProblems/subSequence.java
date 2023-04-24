package PraticeProblems.PraticeProblems;

import java.util.ArrayList;
import java.util.List;

public class subSequence {

	
	public static void main(String[] args) {
		String s = "bbaaaa"; 
		String t = "aaaaaa";
//		s = s.replaceFirst("['a']", "z");
//		System.out.println(s);
//		s = s.replaceFirst("['a']", "z");
//		System.out.println(s);
		System.out.println(isSubsequence(s, t));
		List<String> a = new ArrayList<>();
		a.size();

	}
	
    public static boolean isSubsequence(String s, String t) {
    	int idx1 = 0 ;
    	int idx2 = 0;
    	for(int i=0;i<t.length();i++) {
    		idx1 = idx2 ;
    		String ch = Character.toString(t.charAt(i));
    		if(s.contains(ch)){
    			idx2 = s.indexOf(ch);
    			s = s.substring(idx2);
    			idx2 = s.indexOf(ch);
    			s = s.replaceFirst("['"+ch+"']", "0");
    			System.out.println("In if block");
    			if(idx2<idx1) return false; 
    			
    			System.out.println(s);
    		}
    		else {
    			return false;
    		}
    	}
        
    	
    	return true;
    }

}
