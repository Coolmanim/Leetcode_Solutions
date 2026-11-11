import java.util.*;

public class Foursum18{

    public static void main(String[] main){
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(nums,-294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;int l=nums.length-1;
                while(k<l){
                    long sum=nums[i]+nums[k];
                    sum+=nums[j];
                    sum+=nums[l];
                    if(sum==target){
                        res.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }else if(sum>target){
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}