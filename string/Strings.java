package dsa.string;

import java.util.*;

class Strings {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);
        String str="Hello   world";
        String str1=new String("Hello World");
        String str2=new String("hello world");
        String str3=" ";
        
        String str5="I,am,Piyush,Mali";
        str5=str5.replace(","," ");
        System.out.println(str5);
        String [] arr1= str5.split(" "); 
        
        System.out.println(Arrays.toString(arr1));

        
        //toCharArray convert a sting into a array
        
        char[] arr=str.toCharArray();
        
        for(char c:arr){
            System.out.print(c + ",");
        }
        
        System.out.println();
        
        System.out.println(Arrays.toString(arr));
        
        // startswith and end with to check if starts or ends with and it is caseSenstive
        System.out.println(str.startsWith("hello"));
        System.out.println(str.endsWith("world"));

        
        
        // empty is used for checking is complety empty but if there are spaces it gives false so we use is blank to check if not char inside the string
        System.out.println(str3.isBlank());
        System.out.println(str3.isEmpty());
        
        // Subsrting for any sub part of the string is need and conatins to cjeck if any specify is part there or not in the word and it is casesensitve
        String str4=str.substring(2,10);
        
        System.out.println(str4);
        
        System.out.println(str.contains("world"));
        
        // trim is used at start and end space removing 
        System.out.println(str.length());
        
        str=str.trim();

        System.out.println(str.length());
        
        
        // comparsion == is used for refernce . , .equals() is used for same case , .equalsIgnore case is used for differnt case but all these will give false if there is didffernt spacing between the words
        
        if(str==str1){
            System.out.println("== are equal");
        }
        else{
            System.out.println("== are not equal");

        }
        
         if(str.equals(str1)){
            System.out.println("equals are equal");
        }
        else{
            System.out.println("equals are not equal");

        }
        
        if(str1.equals(str2)){
            System.out.println("equals are equal");
        }
        else{
            System.out.println("equals are not equal");

        }
        
         if(str.equalsIgnoreCase(str1)){
            System.out.println("equalsIgnoreCase are equal");
        }
        else{
            System.out.println("equalsIgnoreCase are not equal");

        }
         if(str1.equalsIgnoreCase(str2)){
            System.out.println("equalsIgnoreCase are equal");
        }
        else{
            System.out.println("equalsIgnoreCase are not equal");

        }
    }
}

// output
// Start small. Ship something.
// I am Piyush Mali
// [I, am, Piyush, Mali]
// H,e,l,l,o, , , ,w,o,r,l,d,
// [H, e, l, l, o,  ,  ,  , w, o, r, l, d]
// false
// true
// true
// false
// llo   wo
// true
// 13
// 13
// == are not equal
// equals are not equal
// equals are not equal
// equalsIgnoreCase are not equal
// equalsIgnoreCase are equal