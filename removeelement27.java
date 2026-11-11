public class removeelement27 {
    public static void main(String[] args){
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int o=removeElement(a,2);
        System.out.println(o);
    } 
    public static int removeElement(int[] nums, int val) {
        int c=0;int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(nums[c]!=nums[i]){
                    j++;
                }
                nums[c++]=nums[i];
                //c++;
            }
        }
        return j;
    }
}
