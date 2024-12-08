class Rotate{

    public int [] cyclic(int[] a, int k) {
        int n= a.length;
        int i,j;
       for(i=n-k,j=n-1;i<j;i++,j--){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
       }

       for(i=0,j=n-k-1;i<j;i++,j--){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
       }

       for(i=0,j=n-1;i<j;i++,j--){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
       }
           return a;

       
    }

}

public class RotateArray{
public static void main(String[] args) {

    Rotate ob = new Rotate();
    int a[] ={1,2,3,4,5};
    int k=2;
    ob.cyclic(a,k);

    for (int t = 0; t < a.length; t++) {
        System.out.print(a[t] + " ");
    }
   
}
}