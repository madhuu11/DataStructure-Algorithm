public class CommonProblem {
	public static void main(String[] args) {
		int[] nums = {8, 8, 7, 6, 5};
		int largeEle = largestElement(nums);
		System.out.println("Largest Element of an array is : "+largeEle);
		
		int secondEle = secondLargestElement(nums);
		System.out.println("Second Element of an array is : "+secondEle);

	}
	
	public static int secondLargestElement(int[] nums) {
        int first = -1, second = -1;
        for(int i=0; i<nums.length; i++){
            if(first<nums[i]){
                second =first;
                first = nums[i];                
            } 
            if(nums[i]>second && nums[i]<first ){
                second = nums[i];
            }
        }
        return second;
    }
	
	public static int largestElement(int[] nums) {
        int large = nums[0];
        for(int i=1; i<nums.length; i++){
            if(large<nums[i]) large = nums[i];
        }
        return large;
    }
}
