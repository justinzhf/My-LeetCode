public class Solution492 {
    public int[] constructRectangle(int area) {
        int mid=(int)Math.sqrt(area);
        int a=0,b=0;
        int[] res=new int[2];
        for(int i=mid;i>0;i--){
            if(area%i==0){
                a=i;
                b=area/i;
                break;
            }
        }

        if(a>b){
            res[0]=a;
            res[1]=b;
            return res;
        }else {
            res[1]=a;
            res[0]=b;
            return res;
        }
    }
    public static void main(String[] args) {
        int[] a=new Solution492().constructRectangle(6);
        System.out.println(a[0]+":"+a[1]);
    }
}
