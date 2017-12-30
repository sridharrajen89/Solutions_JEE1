package com.htcinc.oops.day12;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/*
 
 16. File 'issues.txt' that contains comma separated issue records as follows    
 issueId     issueGeneratedDate    issueCategory     issueDescription    
 Read each line of issue records and load into an ArrayList<Issue> in a Java program. 
 
 */


public class IssueMain {
	public static void main(String[] args) {
		ArrayList<Issue> issList=new ArrayList<Issue>();
		
		File file=new File("C:\\Users\\Nagender\\Desktop\\HTC Java\\Dec 29, 2017\\issue.txt");
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader(file));
			String str="";
			
			while ((str=br.readLine())!= null) {
				
				String [] strParts=str.split(",");
				Issue issue=new Issue(Integer.valueOf(strParts[0]), strParts[1], strParts[2], strParts[3]);
				
				issList.add(issue);
	
			}
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("Displaying issues from issueList : \n");
		for (Issue iss : issList)
			System.out.println(iss);
		
	}

}
