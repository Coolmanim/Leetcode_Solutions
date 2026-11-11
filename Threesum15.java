import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;


public class Threesum15 {
    public static void main(String[] args){
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int first=i+1;int end=nums.length-1;
            
            while(first<end){
                if((nums[i]+nums[first]+nums[end])==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[first],nums[end])));
                    first++;end--;
                    while(first<end && nums[first] == nums[first-1]){
                        first++;
                    }
                    while(first<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }else if((nums[i]+nums[first]+nums[end])<0){
                    first++;
                }else{
                    end--;
                }
            }
        }
        return new ArrayList<>(res);
    }

    //BETTER BUT NOT THE BEST AS TIME COMPLEXITY IS O(n*n*logn)
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Arrays.sort(nums);
    //     Set<List<Integer>> res=new HashSet<>();
    //     HashMap<List<Integer>,Integer> bi=new HashMap<>();
    //     for(int i=0;i<nums.length-2;i++){
    //         for(int j=i+1;j<nums.length-1;j++){
    //             List<Integer> tr=new ArrayList<>(Arrays.asList(nums[i],nums[j]));
                
    //             bi.put(tr, -1*(nums[i]+nums[j]));
    //             int start=0;int end=nums.length-1;
    //             while(start<=end){
    //                 int m=start+(end-start)/2;
    //                 if(nums[m]==bi.get(tr)){
    //                     tr.add(nums[m]);
    //                     Collections.sort(tr);
    //                     res.add(tr);
    //                     break;
    //                 }else if(nums[m]>bi.get(tr)){
    //                     end=m-1;
    //                 }else{
    //                     start=m+1;
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(res);
    // }


    //BRUTE FORCE
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> res=new HashSet<>();
    //     for(int i=0;i<nums.length-2;i++){
    //         for(int j=i+1;j<nums.length-1;j++){
    //             for(int k=j+1;k<nums.length;k++){
    //                 if((nums[i]+nums[j]+nums[k])==0){
    //                     List<Integer> tr=Arrays.asList(nums[i],nums[j],nums[k]);
    //                     Collections.sort(tr);
    //                     res.add(tr);
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(res);
    // }

}
