package com.joi.interview.questions;

import java.io.StringReader;

public class StringReaderDemo {
	
	
	public static void main(String[] args)  throws Exception{
		
		
		String ss="abbcbcbcaHBBAH jdvjd ";
		
		StringReader reader=new StringReader(ss);
		 int k=0;  
         while((k=reader.read())!=-1){  
             System.out.print((char)k);  
         }  
		
		
	}

}
