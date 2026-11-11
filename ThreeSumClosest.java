import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args){
        int[] arr={-84,92,26,19,-7,9,42,-51,8,30,-100,-13,-38};
        System.out.println(threeSumClosest(arr,78));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=1000000;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int first=i+1;int end=nums.length-1;
            while(first<end){
                int sum=(nums[i]+nums[first]+nums[end]);
                if(abs(target-close)>=abs(target-sum) || close==1000000 || nums[i]+nums[first]+nums[end]==target){
                    System.out.println(i+"     "+first+"    "+end);
                    close=sum;
                }
                if(sum<target){
                    first++;
                    while(first<end && nums[first] == nums[first-1]){
                        first++;
                    }
                }else{
                    end--;
                    while(first<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }
            }
        }
        return close;
    }
    public static int abs(int a){
        if(a<0){
            return -1*a;
        }
        return a;
    }
}
