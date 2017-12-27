package com.htcinc.weekone;

class StringServiceProvider { 
	 
 	public static boolean findKeyinString(String str,char key){ 
 		boolean flag=false; 
 		char[] str1=str.toCharArray(); 
 		for(int i=0;i<str.length();i++){ 
			if(key==str1[i]){ 
 				flag=true; 
				System.out.println("Found"); 
 				break;				 
 			} 
 		} 
		if(!flag){ 
 			System.out.println("Not found"); 
 		} 
 		return flag; 
 	} 
 	 

 	public static char[]  subString(String str){ 
 		char temp;
 		char[] arr = str.toCharArray();
 		int len = arr.length;
 		for(int i=0; i<(str.length())/2; i++,len--){
 		    temp = arr[i];
 		    arr[i] = arr[len-1];
 		    arr[len-1] = temp;
 } 
 	      return arr;
 	}
 
 	public static String reverse(String input){
 	    char[] in = input.toCharArray();
 	    int begin=0;
 	    int end=in.length-1;
 	    char temp;
 	    while(end>begin){
 	        temp = in[begin];
 	        in[begin]=in[end];
 	        in[end] = temp;
 	        end--;
 	        begin++;
 	    }
 	    return new String(in);
 	}
 	
 	public String reverse1(String input){
 	    char[] in = input.toCharArray();
 	    int begin=0;
 	    int end=in.length-1;
 	    char temp;
 	    while(end>begin){
 	        temp = in[begin];
 	        in[begin]=in[end];
 	        in[end] = temp;
 	        end--;
 	        begin++;
 	    }
 	    return new String(in);
 	}
 public class StringService { 
 	public void main(String args[]){ 
 		StringServiceProvider ssp = new StringServiceProvider(); 		
		String str="HareRamaHareKrishna ";
		System.out.println("Original String :" + str);
		//search and replace
		System.out.println("Replace char 'R' with 'K':"+str.replace('R', 'R'));                   
		System.out.println("Replace first occurance of string :"+str.replaceFirst("Ra", "ha"));                   
		System.out.println("Replacing all :"+str.replaceAll("rama", "hama"));
		//reverse
		System.out.println("Reverse String :" + StringServiceProvider.reverse(str));
		//search
 		StringServiceProvider.findKeyinString(str, 'z'); 
 		StringServiceProvider.subString(str); 
 		
 		//without static methods calling  		
 		System.out.println("Reverse String :" +ssp.reverse1(str));
 	} 
  
 } 
}