package com.htc.week3;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadIssueFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Issue> issue = new ArrayList<Issue>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C://Users//madhavi//Desktop//issues.txt"));
			
			//read first line from text file
			String str = br.readLine();
			while(str!=null)
			{
				String[] s = str.split(",");
				
				int issueId = Integer.parseInt(s[0]);
				String issueGeneratedDate = s[1];
				int issueCategory = Integer.parseInt(s[2]);
				String issueDescription = s[3];
				
				//adding to ArrayList
				Issue is= new Issue(issueId,issueGeneratedDate,issueCategory,issueDescription);
				issue.add(is);
				
				str = br.readLine();
			}
			br.close();
		}catch(FileNotFoundException ae) {ae.printStackTrace();;}
		catch(IOException ae) {ae.printStackTrace();}
		
		//Display
		for(Issue i : issue)
		{
			System.out.println(i);
		}
	}

}
