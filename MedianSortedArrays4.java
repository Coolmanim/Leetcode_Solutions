
public class MedianSortedArrays4 {
    public static void main (String[] args){
        int[] num={1,2};
        int[] num1={3,4};
        System.out.println(findMedianSortedArrays(num1, num));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num3=new int[nums1.length+nums2.length];
        int a=0;
        int b=0;
        for(int i=0;i<num3.length;i++){
            if(a==nums1.length){
                num3[i]=nums2[b];
                b++;    
            }else if(b==nums2.length){
                num3[i]=nums1[a];
                a++;
            }else if(nums1[a]>=nums2[b]){
                num3[i]=nums2[b];
                b++;
            }else{
                num3[i]=nums1[a];
                a++;
            }
        }
        a=(num3.length-1);
        if(a%2==0){
            return num3[a]/2;
        }else{
            return (num3[a]+num3[a+1])/2;
        }
    }
}
