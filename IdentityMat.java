import java.util.Scanner;
class IdentityMat{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int rows;
        int cols;
        boolean identity=true;
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
         if(rows!=cols){
                    System.out.println("Not and Identity matrix");
                    return;
                }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        identity=false;
                        break;
                    }
            }else{
                if(arr[i][j]!=0){
                    identity=false;
                    break;
                }
            }
        }
        
    }
    if(identity==true){
        System.out.println("Identity Matirx");
    }else{
        System.out.println("Not an Identity Matrix");
    }

        }
}