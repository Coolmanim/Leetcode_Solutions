public class rotatedpeak153 {
    public static void main(String[] args){
        int[] nums = new int[]{3,1,3};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int low=0;int high=nums.length-1;
        if(nums[high]>=nums[low])return nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid!=0 && nums[mid]<nums[mid-1])return nums[mid];
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1])return nums[mid+1];
            if(nums[low]<=nums[mid])low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
