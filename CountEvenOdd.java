import java.util.Scanner;
class CountEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        int countEven=0;
        int countOdd=0;
        System.out.println("enter no of rows:");
        rows = sc.nextInt();
        System.out.println("enter no of cols:");
        cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }
            }
        }
        System.out.println("Even ="+countEven);
        System.out.println("Odd ="+countOdd);
        sc.close();

    }
}