/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author A R F T
 */
public class Task2 {
  static void DisplayVertical(String s)
  {
      for(int i=0;i <s.length();i++)
      {
          if(s.charAt(i) !=' ')
          System.out.println(s.charAt(i));
      }
  }
    public static void main(String[] args) {
        
        String s;
        System.out.println("Please entera sentence:");
        Scanner obj = new Scanner(System .in);
        s=obj.nextLine();
        System.out.println("You sentecnce printed vertically is:");
        DisplayVertical(s);
        
    }
    
}
