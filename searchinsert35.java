public class searchinsert35 {
    public static void main(String[] args){
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
    public static int lower(int nums[],int target){
        int low=0;
        int f=0;int l=nums.length-1;
        while(f<=l){
            int mid=(f+l)/2;
            // if(nums[mid]==target){
            //     low=mid;
            //     break;
            if(nums[mid]>=target){
                low=mid;
                l=mid-1;
            }else{
                f=mid+1;
            }
        }
        return low;
    }    
    public static int searchInsert(int[] nums, int target) {
        int lb=lower(nums, target);
        return lb;
        // int ub=upper(nums, target);
        // return lb+1;
    }
    
}
