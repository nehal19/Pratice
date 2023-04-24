package PraticeProblems.PraticeProblems;

import java.util.Arrays;

public class longestPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","fawer","flight","fl",""};
	    Arrays.sort(strs);
	    for(String s : strs) {
		    System.out.println(s);
	    }
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        System.out.println(s1.substring(0, idx));

	}

}
