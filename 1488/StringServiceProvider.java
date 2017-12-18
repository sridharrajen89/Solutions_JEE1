package com.htc.oops;

public class StringServiceProvider {

		// Static example
		
		public static String reverse(String str) {
			/**
	         * reverse string
	        */
	        char arr[]=str.toCharArray();
	        int i=0,j=arr.length-1;
	        while(i<=j)
	        {
	            char temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            i++;
	            j--;
	        }
	        String reverse=new String(arr);
	        return reverse;
	       
		}
			
		// Find Linear Search
		
		public static boolean findKeyinString(String str,char key){

			boolean flag=false;

			char[] str1=str.toCharArray();

			for(int i=0;i<str.length();i++){

				if(key==str1[i]){

					flag=true;

					// System.out.println("Found");

					break;				

				}

			}

			if(!flag){

				// System.out.println("Not found");

			}

			return flag;

		}
		// Replace String
			public static String replaceString(String A, char findChar, String B) 
			{
				String replaceString="";
				for (int i=0; i<A.length();i++) 
				{
					if (findChar == A.charAt(i))
					{
						replaceString = replaceString + B;
					}
					else
					{
						replaceString = replaceString + A.charAt(i);
					}
				}
				
				return replaceString;
				
			}
	}


