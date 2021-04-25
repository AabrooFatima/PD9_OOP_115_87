
package task4;

/**
    Adding functions of string manipulation to make the job easier for user
    Last Updated April 24, 2021
       
    @author Aabroo Fatima
*/

public class MyString 
{
    /**
        Space in a string 
        @param s string to be manipulate
        @return no of spaces in the string
    */
    public int spaceCounter(String s)
    {
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               n++;   
            }
        }
        return n;
    }
    /**
        lower case alphabets in a string 
        @param t string to be manipulate
        @return no of lowercase alphabets in the string
    */
    public int SmallCounter(String t)
    {
        int s=0;
       
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)>='a' && t.charAt(i)<='z')
                s++;
        }
    
    return s;
    }
    /**
        Upper case alphabets in a string 
        @param t string to be manipulate
        @return no of Uppercase alphabets in the string
    */
    public int CapitalCounter(String t)
    {
        int c=0;
       
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)>='A' && t.charAt(i)<='Z')
                c++;
        }
    
    return c;
    }
    /**
        If the string starts and ends with the same character
        @param s string to be manipulate
        @return true if starting and ending characters are same
    */
    public boolean EndWithSame(String s)
    {
        boolean flag=false;
        int l= s.length();
        if( s.charAt(0)==s.charAt(l-1))
        {
            flag =true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
    /**
        If the string is palindrome (reads same backward)
        @param s string to be manipulate
        @return true if the string is palindrome
    */
    public boolean isPalindrome(String s)
    {
        boolean flag=false;
        int l=s.length();
        int m=0;
        int n=0;
        if(l%2 !=0)
        {
            m= l+1;
            m=m/2;
            for(int i=0;i<l-m;i++)
            {
                n=i+1;
                if(s.charAt(i) == s.charAt(l-n))
                    flag=true;
                else
                {
                    flag=false;
                    break;
                }
                
            }
        }
        return flag;
    }
    /**
        How many time the char has occurred in the string
        @param s string to be manipulate
        @param c the character to be matched
        @return number of times character has occurred
    */
    public int hasOccurred(char c, String s)
    {
        int o=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                o++;
        }
        return o;
    }
    /**
        To make username for string
        @param s string to be manipulate
        @return username 
    */
    public String generateUserName(String s)
    {
        int n= spaceCounter(s);
        int m=0;
        String r="";
        if(n==1)
        {
            for(int i=0;i<s.length();i++)
            {
                if( s.charAt(i) != ' ')
                {
                    r= r+ s.charAt(i);
                    
                }
                else
                {
                    m=i;
                    break;
                }
            }
            r= r+"_115";
            return r;
        }
        else if(n==2)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) != ' ')
                {
                    r=r+s.charAt(i);
                }
                else
                {
                    m=i;
                    break;
                }
            }
            r= r+"_";
            for(int i=m+1;i<s.length();i++)
            {
                if(s.charAt(i) !=' ')
                {
                    r= r+s.charAt(i);
                }
                else
                {
                    break;
                }
                     
            }
            r= r+ "115";
        }
        else if(n==0)
        {
            r= r +s+"__83";
            return r;
        }
        else
        {
            
            r = r+"@"+s;
            return r;
        }
        
        
    }
}    

