public class fectorial {
    int fact=1;
    int callfact(int no )
    {
        if(no>1){
            fact=fact*no;
            callfact(no-1);

        }
        return fact;
    }

    public static void main(String args[]){
        int no =5;
        fectorial f = new fectorial();
        int res= f.callfact(no);
        System.out.println(res);
    }
}
