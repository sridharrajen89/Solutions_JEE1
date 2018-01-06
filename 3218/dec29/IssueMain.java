package com.htc.dec29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IssueMain 
{
	 
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Issue> IList = new ArrayList<Issue>();
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\skuma\\Desktop\\issues.txt")))
		{
			String sCurrentLine;
			String[] arr;
			while((sCurrentLine=br.readLine())!=null)
			{
				arr =sCurrentLine.split(",");
				Issue I = new Issue();
				I.setIssueId(arr[0]);
				I.setIssueGeneratedDate(arr[1]);
				I.setIssueCategory(arr[2]);
				I.setIssueDescription(arr[3]);
				IList.add(I);
			}
		System.out.println(IList);	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
