package dsa.arrays;

import java.util.*;

public class Arrays2D {
    public static void main(String[] args) {
     System.out.println("Start small. Ship something.");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row and col");
        int r = sc.nextInt();
        int c = sc.nextInt(); 
        int sum=0;
        int mul=1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        int [][] arr = new int [r][c];
        
        for (int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
         for (int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
                sum+=arr[i][j];
                mul*=arr[i][j];
                
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
                
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
            System.out.println();
        }
        
        
        
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
        System.out.println("________________________________________________________________");
        
        // jagged Arrays
        
        int [][] arr1={
                      {1,2,3,4},
                      {2,3,5},
                      {1,2},
                      {6,7,8}
        };
        
        int sum1=0;
        int mul1=1;
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        
         for (int i=0;i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                System.out.print(arr1[i][j] +" ");
                sum1+=arr1[i][j];
                mul1*=arr1[i][j];
                
                if(max1<arr1[i][j]){
                    max1=arr1[i][j];
                }
                
                if(min1>arr1[i][j]){
                    min1=arr1[i][j];
                }
            }
            System.out.println();
        }
        
        // jaged array input
        
        System.out.println("________________________________________________________________");

        int a=sc.nextInt();
        
        int [][] arr2= new int[a][];
        
        for(int i=0;i<arr2.length;i++){
            arr2[i]= new int[sc.nextInt()];
        }
        
        for (int i=0;i<arr2.length;i++){
            for(int j=0; j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
    }

// output
// Start small. Ship something.
// Enter the row and col
// 2
// 2
// 1
// 2
// 3
// 4
// 1 2 
// 3 4 
// [1, 2]
// [3, 4]
// ________________________________________________________________
// 1 2 3 4 
// 2 3 5 
// 1 2 
// 6 7 8 
// ________________________________________________________________
// 3
// 1
// 2
// 3
// 1
// 2
// 3
// 4
// 5
// 6
// [1]
// [2, 3]
// [4, 5, 6]
}
