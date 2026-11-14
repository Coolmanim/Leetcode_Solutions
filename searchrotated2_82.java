public class searchrotated2_82 {
    public static void main(String[] args){
        int[] nums = new int[]{3,1,1};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static boolean search(int[] nums, int target) {
        int low=0;int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return true;
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;high--;
            }else if(nums[mid]>=nums[low]){
                if(target<=nums[mid] && nums[low]<=target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target<=nums[high]  && target>=nums[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    
}
