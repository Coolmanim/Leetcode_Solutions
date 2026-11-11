public class ContainerWater11{
    public static void main (String[] args){
        int height[]={1,1};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                if(((j-i)*min(height[i],height[j]))>max){
                    max=((j-i)*min(height[i],height[j]));
                    System.out.println(max);
                }
            }
        }
        return max;
    }

    public static int min(int a,int b){
        if(a>=b){
            return b;
        }else{
            return a;
        }
    }
}