public class binarySearch {
        public static boolean order(int[] arr){
           if(arr[0]<arr[arr.length-1]){
             return true;
           }
           return false;
        }
 
         public static int binarySearch(int[] arr, int target,boolean order) {
           int start=0;
           int end=arr.length-1;
           for(int i=0; i<arr.length-1; i++){
             int mid=(start+end)/2; 
             if(arr[mid]==target){
                 return mid;
             }
             if(order){            //Ascending order
                 if(arr[mid]<target){
                     start= mid+1;
                 }
                 else
                   end=mid-1;
             }
             else{             //descending order
                 if(arr[mid]>target){
                     start= mid+1;
                 }
                 else
                   end=mid-1;
             }  
           }
           return -1;  //if element is not present...
         }
     public static void main(String[] args)
     {
      int[] arr={6,5,4,3,2,1};
      int target=1;
      // order(arr);
      int result=binarySearch(arr, target,order(arr));
      System.out.println(result);
 }
 }