public class Spiral{

    public static void spiralArray(int arr[][]) {
        int startRow = 0;
         int endRow = arr.length-1;
          int startCol = 0;
           int endCol = arr[0].length-1;

           while(startCol<=endCol&& startRow<=endRow){
            for(int i = startRow;i<=endCol;i++){        //Top
                System.out.print(" "+arr[startRow][i]);
            }
            startRow++;
            for(int j = startRow;j<=endRow;j++){    //Right
                System.err.print(" "+arr[j][endCol]);
            }
            endCol--;
            for(int k =endCol;k>=startCol;k--){  // Bottom

                if(startRow==endRow){
                   // break;
                }
                System.out.print(" "+arr[endRow][k]);
            }
            endRow--;
            for(int v =endRow;v>=startRow;v--){   // Left

                if(startCol== endCol){
                   // break;
                }
                System.out.print(" "+arr[v][startCol]);
            }
           
            startCol++;

           }

        
    }

    public static void main (String args[]){

        int arr[][] = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        spiralArray(arr);
    }
}