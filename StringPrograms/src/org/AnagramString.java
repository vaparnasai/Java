package org;
import java.util.Arrays;

public class AnagramString 
{
    public static void anagram (String s1,String s2)
    {

        if (s1.length() == s2.length()) 
        {
        	String str = s1.toLowerCase();
            String str1 = s2.toLowerCase();
            //Convert into char array
            char[] ch1 = str.toCharArray();
            char[] ch2 = str1.toCharArray();
            //Sort the array (pre-defined method)
            //Arrays.sort(ch1); static method present in arrays class
            //Arrays.sort(ch2);
            
            //Sort without using pred-defined method
            for (int i=0;i<=ch1.length-1;i++)
    		{
    			for (int j=i+1;j<=ch1.length-1;j++)
    			{
    				if (ch1[i]>ch1[j])
    				{
    					char temp = ch1[i];
    					ch1[i] = ch1[j];
    					ch1[j] = temp;
    				}
    			}
    		}
            for (int i=0;i<=ch2.length-1;i++)
    		{
    			for (int j=i+1;j<=ch2.length-1;j++)
    			{
    				if (ch2[i]>ch2[j])
    				{
    					char temp = ch1[i];
    					ch2[i] = ch2[j];
    					ch2[j] = temp;
    				}
    			}
    		}
            //System.out.println(Arrays.toString(ch1));
            //System.out.println(Arrays.toString(ch2));
            boolean res = Arrays.equals(ch1, ch2);
            if (res == )
            {
                System.out.println("It is an Anagram");
            } 
            else 
            {
                System.out.println("It is not an Anagram");
            }
        } 
        else 
        {
            System.out.println("It is not an Anagram");
        }
    }
    public static void main(String[] args) 
    {
        String s1 = "Race";
        String s2 = "Care";
        anagram(s1,s2);
    }
}
