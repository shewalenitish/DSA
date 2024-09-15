import java.util.Arrays;

class bubbleSort{
   public static void main(String[] args) {
     int[] arr={1,5,6,2,3};
  
     System.out.println(Arrays.toString(bubble(arr)));
     
   }
   static int[] bubble(int[] arr){
      boolean state=true;
       for(int i=0; i<arr.length; i++){
         for(int j=1; j<arr.length-i; j++){
            if(arr[j]<arr[j-1]){
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               state=false;
            }
         }
         if(state){
            break;
         }
       }
       return arr;
   }
}
