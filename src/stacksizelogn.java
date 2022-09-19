public class stacksizelogn {

    public static int calPower(int x, int n){
        if(x==0) {
            return 0;
        }
        if(n==0){
            return 1;
        }
        //if n is even
        if(n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);
        }else{
            return calPower(x,n/2)*calPower(x,n/2)*x;
        }

        //  int xpownm1= calPower(x,n-1);
        // int xpown=(x*xpownm1);
        // return xpown;
    }
    public static void main(String args[]){
        int x=2,n=5;
        int res =calPower(x,n);
        System.out.println(res);

    }
}