/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author DELL PC
 */
public class Task1 {

    
    public static int wordCounter(String s)
    {
        int count = 0;
        int size= s.length();
        for(int i = 0; i<size; i++)
        {
             if( ((i>0)&&(s.charAt(i)!=' ')&&(s.charAt(i-1)==' ')) || ((s.charAt(0)!=' ')&&(i==0)))
             {
                 count++; 
             }
        }
        return count;
    }
    
    public static int vowelcounter(String s)
    {
        int count = 0;
        int size= s.length();
        for(int i = 0; i<size; i++)
        {
              if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o' || s.charAt(i) == 'u' )
             {
                 count++; 
             }
        }
        return count;
    }
    
    public static int puncCount(String s)
    {
        int count = 0;
        int size= s.length();
        for(int i = 0; i<size; i++)
        {
             if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' || s.charAt(i) == '?' ||s.charAt(i) == '-' || s.charAt(i) == ':' || s.charAt(i) == '_')
             {
                 count++; 
             }
        }
        return count;
    }
    
    public static boolean findSubString(String s, String sub)
    {
       
        //System.out.println(s.contains(sub));
        return s.contains(sub);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String s;
        String sub;
        System.out.println("Enter a String:");
        s = obj.nextLine();
        System.out.println("Enter a sub String:");
        sub = obj.nextLine();
        System.out.println("So, the total words in String are: " +wordCounter(s)+"\ntotal number of vowels are: " +vowelcounter(s)+"\ntotal number of punctuation marks are: " + puncCount(s));
        System.out.println("If string contain sub String, it returns true otherwise false:  "+findSubString(s, sub));
        
    }
    
}
