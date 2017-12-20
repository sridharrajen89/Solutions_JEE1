package com.htc.javaweek1;
import java.util.Scanner;
public class StringServiceProvider {
	private String inputString;
	private int counter, arrayLength,inputData,inputArray[];
	private String strSearch,strReplace;
	
	static void reverseString(String inputString) {
		System.out.println("Input is " + inputString+ " and Reverse String Result.. ");
	       for(int i=1; i<=inputString.length() ;i++)
	       {  
	            System.out.print(inputString.charAt(inputString.length()-i)); 
	       }
	}
	public void linearSearch() {
	      Scanner input1 = new Scanner(System.in);
	      System.out.println("Enter number of elements for linear Search ...");
	      arrayLength = input1.nextInt(); 
	      //Creating array to store the all the numbers
	      inputArray = new int[arrayLength]; 
	      System.out.println("Enter " + arrayLength + " Integers as input..");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < arrayLength; counter++)
	    	  inputArray[counter] = input1.nextInt();

	      System.out.println("Enter the search value:");
	      inputData = input1.nextInt();

	      for (counter = 0; counter < arrayLength; counter++)
	      {
	         if (inputArray[counter] == inputData) 
	         {
	           System.out.println(inputData+" is present at location "+(counter+1));
	           /*Item is found then stop the search and come out of loop*/
	           break;
	         }
	      }
	      if (counter == arrayLength)
	        System.out.println(inputData + " doesn't exist in array.");
	      input1.close();
	   }
	public void SearchStringReplaceEmp(String inputString,String strSearch,String strReplace){
	     System.out.println("Input String - "+inputString);
	     System.out.println("Search String - "+strSearch);
	     System.out.println("Replace String - "+strReplace);
		  int intIndex = inputString.indexOf(strSearch);
		      if(intIndex == - 1) {
		         System.out.println("Search String not found");
		      } else {
		         System.out.println("Found i/p search string "+ strSearch +" at index " + intIndex);
		         System.out.println("Updated String is "+inputString.replace(strSearch, strReplace));
		      }
		   }
	
	
}
