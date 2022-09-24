import java.util.*;

class permutation{
    public static void main(String[] args) {
        int np=1;
        int rr=1;
        int rp=1;
        Scanner ss =new Scanner(System.in);
        System.out.println("enter the terms :");
        int n=ss.nextInt();
        System.out.println("enter the selection :");
        int r=ss.nextInt();

        for(int i=1; i<=n;i++){
            np=np*i;
        }
        for(int k=1; k<=r;k++){
            rr=rr*k;
        }
        for(int j=1;j<n-r;j++){
            rp=rp*j;
        }
        int cv=rr*rp;
        int npr=np/cv;
        System.out.println("the permutation is "+npr);
    }
}