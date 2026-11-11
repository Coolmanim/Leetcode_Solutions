import java.util.*;
public class unique26{
    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int c=0;int i;
        for(i=0;i<nums.length;i++){
            c++;
            swap(nums,c-1,i);
            while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        }
        return c;
    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}