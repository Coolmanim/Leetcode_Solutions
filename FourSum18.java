import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;

public class FourSum18 {
    public static void main(String[] args){
        int[] p={1,0,-1,0,-2,2};
        System.out.println(fourSum(p,0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int first=i+1;int mid=first+1;int end=nums.length-1;
            while(first<end-2 && mid<end){
                // mid=first+1;
                if((nums[i]+nums[first]+nums[end]+nums[mid])==target){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[first],nums[mid],nums[end])));
                    mid++;end--;
                    while(mid<end && nums[mid] == nums[mid-1]){
                        mid++;
                    }
                    while(mid<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }else if((nums[i]+nums[first]+nums[end]+nums[mid])<0){
                    mid++;
                    if(mid==end){
                        first++;
                        mid=first+1;
                    }
                }else{
                    end--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
