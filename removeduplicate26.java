import java.util.*;
public class removeduplicate26 {

    public static void main(String[] args){
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int o=removeDuplicates(a);
        System.out.println(o);
    } 
    // BRUTE FORCE
    // public static int removeDuplicates(int[] nums) {
    //     int i=0;
    //     for(;i<nums.length && nums[i]!=nums[nums.length-1];i++){
    //         while(i<nums.length-1 && nums[i]==nums[i+1] ){
    //             rem(nums, i);
    //         }
    //     }
    //     System.out.println(Arrays.toString(nums));
    //     return i+1;
    // }
    // public static void rem(int arr[],int a){
    //     for(int i=a+1;i<arr.length;i++){
    //         arr[i-1]=arr[i];
    //     }
    // }

    //BETTER IS WITH IMPLEMENTATION USING SET 

    //EVEN BETTER
     public static int removeDuplicates(int[] nums){
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[c]){
                nums[++c]=nums[i];
            }
        }
        return c+1;
    }
}
