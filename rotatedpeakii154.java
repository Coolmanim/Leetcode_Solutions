public class rotatedpeakii154 {
     public static void main(String[] args){
        int[] nums = new int[]{1,1,3,1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int res=1000000;
        int low=0;int high=nums.length-1;
        int mid=low+(high-low)/2;
        //check if the array is sorted
        if(nums.length==1 || nums[low]<=nums[mid] && nums[mid]<nums[high] && nums[high]>nums[low]){
            return nums[0];
        }
        while(low<=high){
            mid=low+(high-low)/2;
            //to check whther the low hignh and mid are equal if so it reduces the high value but not low as it may skip some essential points(i tried it)
            if(low<high && nums[low]==nums[mid]&&nums[high]==nums[mid]){
                low++;high--;
                res=nums[mid];
                continue;
            }
            if(mid!=0 && nums[mid]<nums[mid-1])return nums[mid];
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1])return nums[mid+1];
            if(nums[low]<=nums[mid])low=mid+1;
            else high=mid-1;
        }
        return res;
    }
    public static int min(int a,int b){
        if(a>b)return b;
        return a;
    }
}
