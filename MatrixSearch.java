import java.util.Scanner;
class MatrixSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int rows;
        int cols;
        int search;
        boolean found=false;
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
        System.out.println("enter an element to search:");
        search=sc.nextInt();
        for(int i=0;i<rows;i++){
            
            for(int j=0;j<cols;j++){
                if(arr[i][j]==search){
                    found=true;
                    System.out.println("Found at Row"+" "+ (i+1) +" "+ "Column"+" "+(j+1));
                }
            }
          
        }
          if(found==false){
                    System.out.println("element not found");
                }
    }
}