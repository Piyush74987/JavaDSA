package dsa.arrays;

import java.util.*;

public class Arrays1D {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int mul=1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        
        for(int i:arr){
            mul*=i;
            sum+=i;
            if(max<i){
                max=i;
            }
            
            if(min>i){
                min=i;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Mul of arry = "+ mul);
        System.out.println("Sum = "+ sum);       
        System.out.println(Arrays.toString(arr));
    }
}
    // output 
    // Start small. Ship something.
    // 5
    // 2
    // 3
    // 10
    // -20
    // -1
    // Min = -20
    // Max = 10
    // Mul of arry = 1200
    // Sum = -6
    // [2, 3, 10, -20, -1]  

