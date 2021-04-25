/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author 2020-CS-87 and co-author 2020-CS-115
 */


public class Task3 {
    
    /**
     * 
     * @param s
     * @return return type is String
     */
  public static String ridMultipleBlank(String s)
  {

     String s2 = s.replaceAll("\\s+", " ");
     return s2;
  }
  /**
   * 
   * @param s
   * @return return type is string
   */
  
  public static String removeInteger(String s)
  {
      String s2 = "";
      int size = s.length();
      for(int i = 0; i<size; i++)
      {
          if (!Character.isDigit(s.charAt(i)))
          {
              s2 = s2 + s.charAt(i);
          }
      }
      return s2;
  }
  /**
   * 
   * @param s 
   */
  
  public static void stringEncryption(String s)
  {
      System.out.println(s);
      char[] ch = s.toCharArray();
      for(char c : ch)
      {
          c += 1;
          System.out.print(c);
      }
      System.out.print("\n");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String s;
        System.out.println("Enter a String:");
        s = obj.nextLine();
        System.out.println("Remove only extra blank spaces from String:  " +ridMultipleBlank(s));
        System.out.println("Remove only integers from from String:  " +removeInteger(s));
        System.out.println("Encryption:");       
        stringEncryption(s);
       
        
    }
    
}
