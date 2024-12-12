package Arrays;
class Rotate2{

    public void cyclic2(int[] a, int k, int n) {

        int temp[] = new int[n-k];
      for(int i=0;i<k;i++){
        temp[i] = a[i];
      }

      for(int i=0;i<k;i++){
        a[i] = a[n-k+i];
      }

      for(int i=0;i<k;i++){
        a[n-k+i] = temp[i];
      } 
    }

}

public class RotateArray2 {
public static void main(String[] args) {
  Rotate2 ob = new Rotate2();
int a[] ={1,2,3,4,5};
int k=2;
int n=5;
  ob.cyclic2(a,k,n);

  for (int t = 0; t < a.length; t++) {
    System.out.print(a[t] + " ");
}
}
}
