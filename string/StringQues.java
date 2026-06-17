package dsa.string;

import java.util.Scanner;

class StringQues {
    public static void main(String[] args) {
         System.out.println("Start small. Ship something.");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        printString(str);
        int n=sizeString(str);
        System.out.println(n);
        int s=numberVowels(str);
        System.out.println(s);
        
        String str1=reverseString(str);
        System.out.println(str1);
        
        paldorime(str);
        
    }
    
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    
    public static int sizeString(String str){
        char[] arr = str.toCharArray();
        int count=0;
        for (char c:arr){
            count ++;    
        }
        int n=arr.length;
        
        // or u return count also 
        return n;
    }
    
    public static int numberVowels(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='o'|| ch=='i'|| ch=='e'|| ch=='u'){
                count++;
            }
        }
        
        return count;
    }
    
    public static String reverseString(String str){
        String str1="";
        
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        
        return str1;
    }
    
    public static void paldorime(String str){
        String str1="";
        
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        
        if(str1.equals(str)){
            System.out.println("pal");
        }
        else{
            System.out.println("Not pal");
        }
        
    }
}

// output:
// madam
// m
// a
// d
// a
// m
// 5
// 2
// madam
// pal