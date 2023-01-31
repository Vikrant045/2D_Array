public class CountOfElement {

    public static void main(String args[]){
         
        int arr[][]= {{4,7,8},{8,8,7}};

        int count = 0;
        int search =7;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==search){
                    count++;
                }
            
            }
        }
        System.out.println(count);


    }
    
}
