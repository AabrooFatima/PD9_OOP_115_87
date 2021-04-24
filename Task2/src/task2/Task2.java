/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;
public class Task2 {
static void DisplayVertical(String s)
{
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=' ')
            System.out.println(s.charAt(i));
    }
}
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        String s;
        System.out.println("Please enter a sentence:");
        s = obj.nextLine();   
        System.out.println("You sentence printed vertically is:");
        DisplayVertical(s);   
    }
    
}
