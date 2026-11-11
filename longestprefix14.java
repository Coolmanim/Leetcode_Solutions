public class longestprefix14{
    public static void main(String[] args) {
        String[] s={"cir","car"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        String a="";
        if(strs.length==1){
            a=strs[0];
        }else{
            for(int i=0;i<strs[0].length();i++){
                char f=strs[0].charAt(i);
                int c=0;
                for(int j=1;j<strs.length;j++){
                    if(i<strs[j].length() && strs[j].charAt(i)==f){
                        c++;
                    }
                    
                }
                if(c==strs.length-1){
                    a+=f;
                }else{
                    break;
                }
            }
        }
        return a;
    }
}