public class TransPoseOf2DArray {

    public static void transPose(int arr[][]) {

        int row =arr[0].length;
        int col = arr.length;
        int TransArray [][]= new int [row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                TransArray[i][j]=arr[j][i];
            }
        }
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
System.out.print(" "+TransArray[i][j]);
            }
            System.out.println();
        }
        

        
    }
    public static void main(String args[]) {

        int arr[][] = {{1,2,3,4},{5,6,7,8},{13,14,15,16}};
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
        System.out.println();

        transPose(arr);
    
}
}
