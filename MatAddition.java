import java.util.Scanner;
class MatAddition{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows;
    int cols;
    int sum=0;
    System.out.println("enter no of rows:");
    rows=sc.nextInt();
    System.out.println("enter no of cols:");
    cols=sc.nextInt();
    int arr1[][]=new int[rows][cols];
    System.out.println("enter the matrix 1 elements:");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr1[i][j]=sc.nextInt();
        }
    }
    int arr2[][]=new int[rows][cols];
    System.out.println("enter the matrix 2 elements:");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr2[i][j]=sc.nextInt();
        }
    }
    int c[][]=new int[rows][cols];
    sc.close();
   
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            c[i][j]=arr1[i][j]+arr2[i][j];
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(c[i][j]+ " ");
        }
        System.out.println();
    }

}
}