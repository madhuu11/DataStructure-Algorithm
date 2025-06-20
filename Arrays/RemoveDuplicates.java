public class RemoveDuplicates {
	public static void main(String[] args) {

//		Given an integer array nums sorted in non-decreasing order, 
//		remove the duplicates in-place such that each unique element appears only once. 
//		The relative order of the elements should be kept the same. 
//		Then return the number of unique elements in nums.
		int k = removeDuplicates(nums);
		System.out.println("length of the distinct array : " + k+ " and the array is ");
		for (int i=0; i<k; i++) {
			System.out.print(nums[i]+" ");
		}

	}

	public static int removeDuplicates(int[] nums) {
		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
