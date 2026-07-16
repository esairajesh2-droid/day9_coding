import java.util.Scanner;
class Mattranspose{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int rows;
        int cols;
        System.out.println("enter no of rows:");
        rows=sc.nextInt();
        System.out.println("enter no of cols:");
        cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(arr[j][i]);
        }
        System.out.println();
    }
    sc.close();
}
}