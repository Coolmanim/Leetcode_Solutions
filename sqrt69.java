public class sqrt69 {
    public static void main(String[] args){
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int res=0;
        if(x==0)return res;
        if(x==1)return 1;
        int l=0;int h=x/2;
        while (l<=h){
            int mid=(h+l)/2;
            if(mid<=x/mid){
                res=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return res;
    }
}
