public class SumOf2ndRow {
    public static void main(String args[]) {

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int row = 1;
        int sum =0;
        for(int i =0;i<arr[0].length;i++){
            sum+=arr[row][i];

        }
        System.out.println(sum);

        
    }
    
}
