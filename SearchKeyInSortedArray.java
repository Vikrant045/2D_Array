public class SearchKeyInSortedArray {
    public static boolean search(int arr[][],int key) {
        int col=arr[0].length-1;
        int cellValue =0;
        int row=0;
        while(row<arr.length&&col>=0){
          cellValue = arr[row][col];
 
         if(key==cellValue){
             System.out.println(row+","+col);
             return true;
           
         }
         else if(key<cellValue){
             col--;
         }
         else if(key>cellValue){
             row++;
         }
        }
 
        return false;
    }

    public static void main (String args[]){

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       // spiralArray(arr);
       int key =15;
       search(arr,key);
     

    }
    
}
