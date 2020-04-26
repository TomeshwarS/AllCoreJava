package com.logical.program;
 
import java.util.HashMap;
import java.util.Map; 
  
public class MaxMinProblem
{ 
  
    static int maxCount(int n,int a[])  
    {  
        Map<Integer, Integer> freq = new HashMap<>();  
      
        for(int i = 0; i < n; ++i) 
        {  
            if(freq.containsKey(a[i]))  
                freq.put(a[i], freq.get(a[i]) + 1);  
            else
                freq.put(a[i], 1);  
        }  
      
        int ans = 0;  
      
        for (Integer key : freq.keySet())  
        {  
            if(freq.containsKey(key+1))  
                ans = Math.max(ans, freq.get(key) + freq.get(key+1));  
        }  
      
        return ans;  
    }  
  
    public static void main(String []args) 
    { 
          
        int n = 6;  
        int arr[] = {1, 2, 2, 3, 1, 2};  
      
        System.out.println(maxCount(n,arr)); 
    } 
}  