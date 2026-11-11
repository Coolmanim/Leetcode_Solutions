import java.util.*;
public class firstandlast34 {
    public static void main(String[] args){
        int[]  nu={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nu, 8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        if(nums==null)return res;
        int f=0;int e=nums.length-1;
        while(f<=e){
            int mid=f+(e-f)/2;
            if(nums[mid]==target){
                while(mid>0 &&nums[mid-1]==nums[mid])mid--;
                res[0]=mid;
                while(mid<nums.length && nums[mid]==nums[mid+1])mid++;
                res[1]=mid;
                return res;
            }else if(nums[mid]>target)e=mid-1;
            else f=mid+1;
        }
        return res;
    }
}
