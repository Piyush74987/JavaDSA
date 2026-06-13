package dsa.arrays;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Hello, World!");


        // delcare an array

        int [] arr2;

        // initialize an array
        arr2 = new int[5];

        // delcaring an array
        int[] arr = new int[5];

        // declaring and initializing an array
        int[] arr1 = {1, 2, 3, 4, 5};

        // accessing an array
        System.out.println(arr1[0]);    

        // changing an array value
        arr1[0] = 10;
        System.out.println(arr1[0]);

        // getting the length of an array
        System.out.println(arr1.length);       

        // iterating an array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }  

        // iterating an array using for-each loop
        for (int num : arr1) {     
            System.out.println(num);
        }   

        // multidimensional array
        int[][] multiArr = {    
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // accessing a multidimensional array
        System.out.println(multiArr[0][0]);     

        // iterating a multidimensional array
        for (int i = 0; i < multiArr.length; i++) { 
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }

        // iterating a multidimensional array using for-each loop
        for (int[] row : multiArr) {    
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // jagged array
        int[][] jaggedArr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };  


        // accessing a jagged array
        System.out.println(jaggedArr[0][0]);

        // iterating a jagged array
        for (int i = 0; i < jaggedArr.length; i++) {        
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }   


        // iterating a jagged array using for-each loop
        for (int[] row : jaggedArr) {    
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }   


        // array of objects
        String[] strArr = {"Hello", "World", "Java", "Arrays"}; 
        // accessing an array of objects
        System.out.println(strArr[0]);      
        // iterating an array of objects
        for (String str : strArr) {
            System.out.println(str);
        }   




        
    }
    
}
