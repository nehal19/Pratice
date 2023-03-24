package PraticeProblems.PraticeProblems;

public class twoSum {

	public static void main(String[] args) {
		int [] que = {1,2,3,4,5};
		int target = 7 ;
		int[] ans = twoSum(que,target);
		for(int a : ans) {
			System.out.println(a);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	int[] ans = new int[2];
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i]+nums[j]==target) {
    				ans[0] = i ;
    				ans[1] = j ;
    				break;
    			}
    		}
    	}
		return ans;
        
    }

}
