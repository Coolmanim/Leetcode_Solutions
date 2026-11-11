import java.util.*;
public class firstandlast34 {
    public static void main(String[] args){
        int[]  nu={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nu, 8)));
    }
    // public static int[] searchRange(int[] nums, int target) {
    //     int[] res={-1,-1};
    //     if(nums==null)return res;
    //     int f=0;int e=nums.length-1;
    //     while(f<=e){
    //         int mid=f+(e-f)/2;
    //         if(nums[mid]==target){
    //             while(mid>0 &&nums[mid-1]==nums[mid])mid--;
    //             res[0]=mid;
    //             while(mid<nums.length && nums[mid]==nums[mid+1])mid++;
    //             res[1]=mid;
    //             return res;
    //         }else if(nums[mid]>target)e=mid-1;
    //         else f=mid+1;
    //     }
    //     return res;
    // }

    // public static int[] searchRange(int[] nums, int target){
    //     int[] res={-1,-1};
    //     if(nums==null)return res;
    //     int f=0;int e=nums.length-1;
    //     while(f<=e){
    //         int mid=f+(e-f)/2;
    //         if(nums[mid]==target){
    //             if(nums[mid]!=nums[mid-1]){
    //                 res[0]=mid;
    //             }else if(nums[mid]!=nums[mid+1]){
    //                 res[1]=mid;
    //             }
    //         }else if(nums[mid]>target)e=mid-1;
    //         else f=mid+1;
    //     }
    //     return res;
    // }

    //BOTH OF THE UPPER APPROACHES WORK BUT U ARE NOT ALLOWED TO USE LINEAR LOOP AT ALL JUST BINARY
    public static int first(int[] arr,int c){
        int f=-1;
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==c){
                f=mid;high=mid-1;
            }else if(arr[mid]<c){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return f;
    }
    public static int low(int[] arr,int c){
        int l=-1;
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==c){
                l=mid;low=mid+1;
            }else if(arr[mid]<c){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return l;
    }
    public static int[] searchRange(int[] nums, int target){
        int f=first(nums,target);
        if(f==-1)return new int[]{-1,-1};
        return new int[]{f,low(nums, target)};
    }    
}
