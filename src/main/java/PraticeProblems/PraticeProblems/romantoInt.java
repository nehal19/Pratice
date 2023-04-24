package PraticeProblems.PraticeProblems;

public class romantoInt {

	public static void main(String[] args) {
		String s = "MCM" ;
		int ans = 0;
		for(int i=0;i<s.length();i++) {
			char rm = s.charAt(i);
			if(rm=='I') {
				if(i==s.length()-1) {
					ans+=1;
				}
				else if(s.charAt(i+1)=='X') {
					ans+=9;
					i++;
				}
				else if(s.charAt(i+1)=='V') {
					ans+=4;
					i++;
				}
				else {
					ans+=1;
				}
			}
			else if(rm=='X') {
				if(i==s.length()-1) {
					ans+=10;
				}
				else if(s.charAt(i+1)=='L') {
					ans+=40;
					i++;
				}
				else if(s.charAt(i+1)=='C') {
					ans+=90;
					i++;
				}
				else {
					ans+=10;
				}
					
			}
			else if(rm=='C') {
				if(i==s.length()-1) {
					ans+=100;
				}
				else if(s.charAt(i+1)=='D') {
					ans+=400;
					i++;
				}
				else if(s.charAt(i+1)=='M') {
					ans+=900;
					i++;
				}
				else {
					ans+=100;
				}
					
			}
			else {
				if(rm=='V') {
					ans+=5;
				}
				else if(rm=='L') {
					ans+=50;
					
				}
				else if(rm=='D') {
					ans+=500;
				}
				else {
					ans+=1000;
				}
			}
		}
		System.out.println(ans);

	}

}
