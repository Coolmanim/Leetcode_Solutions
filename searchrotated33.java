public class searchrotated33 {
    public static void main(String[] args){
        int[] arr={1,3};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int target) {
        if(isSorted(nums)){
            return binary(nums, target, 0, nums.length-1);
        }else{
            int f=-1;
            if(nums.length>1){
                for(int m=0;m<nums.length;m++){
                    if( m!=nums.length-1 && nums[m]>nums[m+1]){
                        f=m+1;
                        break;
                    }else if(m!=0 && nums[m-1]>nums[m]){
                        f=m;
                        break;
                    }
                }
            }else{
                f=0;
            }
            if(binary(nums, target, 0, f-1)==-1){
                return binary(nums, target, f,nums.length-1);
            }else{
                return binary(nums, target, 0, f);
            }
        }
    }

    public static int binary(int[] nums,int tgt,int start,int end){
        int f=start;int e=end;
        while(f<=e){
            int mid=f+(e-f)/2;
            if(nums[mid]==tgt){
                return mid;
            }else if(nums[mid]>tgt){
                e=mid-1;
            }else{
                f=mid+1;
            }
        }
        return -1;
    }
    public static boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
