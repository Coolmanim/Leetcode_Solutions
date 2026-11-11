import java.util.*;
public class removeelement27 {
    public static void main(String[] args){
        int[] a={0,0,1,1,1,2,2};
        System.out.println(removeElement(a, 1));
        System.out.println(Arrays.toString(a));
    }
    public static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}
