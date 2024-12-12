public class MoveZerosNaive {

    public static void main(String args[]){
        int[]  nums ={0,1,0,3,12};

        int temp[] = new int[nums.length];
        int j=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
               
            }
        }

        while(j<nums.length){
            temp[j] =0;
            j++;
        }

        for (int i = 0; i < nums.length; i++) {
           nums[i] =temp[i];
        }

        for (int i = 0; i < nums.length; i++) {
           System.out.println(nums[i]);
         }
         
        
    }
}