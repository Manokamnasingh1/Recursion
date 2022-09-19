public class stacksize {
    public static int calPower(int x, int n){
        if(x==0) {
            return 0;
        }
            if(n==0){
                return 1;
            }

        int xpownm1= calPower(x,n-1);
        int xpown=(x*xpownm1);
        return xpown;
    }
    public static void main(String args[]){
        int x=2,n=5;
        int res =calPower(x,n);
        System.out.println(res);

    }
}
